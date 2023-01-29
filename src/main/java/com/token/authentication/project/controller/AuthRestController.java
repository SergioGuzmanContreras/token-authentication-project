package com.token.authentication.project.controller;

import com.token.authentication.project.config.jwt.JwtUtils;
import com.token.authentication.project.dao.RoleDao;
import com.token.authentication.project.dao.UserDao;
import com.token.authentication.project.models.request.AuthRequest;
import com.token.authentication.project.models.response.AuthResponse;
import com.token.authentication.project.models.response.ErrorResponse;
import com.token.authentication.project.config.service.UserDetailsImpl;
import com.token.authentication.project.utils.HttpDescription;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@Slf4j
@RestController
@RequiredArgsConstructor
@ApiResponses(value = {
        @ApiResponse(responseCode = HttpDescription.STATUS_400, description = HttpDescription.MSG_400, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_401, description = HttpDescription.MSG_401, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_403, description = HttpDescription.MSG_403, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_404, description = HttpDescription.MSG_404, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_500, description = HttpDescription.MSG_500, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_503, description = HttpDescription.MSG_503, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))})
})
@Tag(name = "Authentication", description = "Authentication Methods.")
public class AuthRestController {

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;
    private final UserDao userDao;
    private final RoleDao roleDao;

    @Operation(summary = "Generate token.", responses = {
            @ApiResponse(description = HttpDescription.MSG_201, responseCode = HttpDescription.STATUS_201, content = {
                    @Content(
                            mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = AuthResponse.class))
            })
    })
    @PostMapping("/auth")
    public ResponseEntity<AuthResponse> authenticateUser(@Valid @RequestBody AuthRequest request) {
        var authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        var token = jwtUtils.generateJwtToken(authentication);
        var userDetails = (UserDetailsImpl) authentication.getPrincipal();
        var roles = userDetails.getAuthorities().stream().map(item -> item.getAuthority()).collect(Collectors.toList());
        return ResponseEntity.ok().body(AuthResponse.builder()
                .token(token)
                .username(userDetails.getUsername())
                .email(userDetails.getEmail())
                .roles(roles)
                .type("Bearer")
                .build());
    }

}
