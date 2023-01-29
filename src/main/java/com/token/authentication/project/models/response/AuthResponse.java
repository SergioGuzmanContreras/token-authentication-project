package com.token.authentication.project.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {

    @JsonProperty("token")
    @Schema(description = "Token", example = "*****", nullable = false)
    private String token;

    @Schema(description = "Type token", example = "Bearer", nullable = false)
    private String type;

    @Schema(description = "User name", example = "admin", nullable = false)
    private String username;

    @Schema(description = "Email.", example = "user@email.com", nullable = false)
    private String email;

    @Schema(description = "Roles.", example = "[ \n \"ROLE_ADMIN\" \n , \"ROLE_USER\" \n ]", nullable = false)
    private List<String> roles;

}
