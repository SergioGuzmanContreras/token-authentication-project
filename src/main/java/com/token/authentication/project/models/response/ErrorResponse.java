package com.token.authentication.project.models.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    @NonNull
    @Schema(description = "Http status")
    private HttpStatus status;

    @NonNull
    @Schema(description = "Error message")
    private String message;

    @JsonFormat(shape = Shape.STRING, pattern="yyyy/MM/dd HH:mm:ss")
    @Schema(description = "Expiration date",
            type = "string",
            anyOf = String.class,
            example = "2022/04/03 20:05:10")
    private LocalDateTime date;
}
