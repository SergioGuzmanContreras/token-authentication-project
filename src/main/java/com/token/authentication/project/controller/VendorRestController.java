package com.token.authentication.project.controller;


import com.token.authentication.project.models.response.ErrorResponse;
import com.token.authentication.project.utils.HttpDescription;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiResponses(value = {
        @ApiResponse(responseCode = HttpDescription.STATUS_400, description = HttpDescription.MSG_400, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_401, description = HttpDescription.MSG_401, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_403, description = HttpDescription.MSG_403, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_404, description = HttpDescription.MSG_404, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_500, description = HttpDescription.MSG_500, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))}),
        @ApiResponse(responseCode = HttpDescription.STATUS_503, description = HttpDescription.MSG_503, content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorResponse.class))})
})
@Tag(name = "Providers", description = "Vendor Methods.")
@RestController
@RequestMapping("/vendor")
public class VendorRestController {

}
