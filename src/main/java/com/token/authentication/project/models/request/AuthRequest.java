package com.token.authentication.project.models.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AuthRequest {

    @NotBlank
    @Schema(description = "User name", example = "admin")
    @Size(min = 5, max = 20)
    private String username;

    @NotBlank
    @Schema(description = "Password", example = "admin")
    @Size(min = 5, max = 20)
    private String password;

}
