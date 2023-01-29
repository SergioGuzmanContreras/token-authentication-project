package com.token.authentication.project.controller;

import com.token.authentication.project.models.response.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.Arrays;

@Slf4j
@RestControllerAdvice
public class GlobalControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handlerBadRequestException(MethodArgumentNotValidException ex){
        log.error("MethodArgumentNotValidException {}", ex);
        var errorMessage =  new StringBuilder("Error");
        ex.getAllErrors().forEach(e -> {
            Arrays.stream(e.getArguments()).forEach(f -> {
                var messages = f.toString().split(";");
                for(String m : messages)
                    if(m.contains("default message"))
                        errorMessage.append(", ").append(m.substring(17)).append(" ");
            });
            errorMessage.append(e.getDefaultMessage());
        });
        var error = ErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST)
                .date(LocalDateTime.now())
                .message(errorMessage.toString())
                .build();
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ErrorResponse> handlerAuthEntryPointJwtUnauthorized(AuthenticationException ex){
        log.error("AuthenticationException {}", ex);
        var error = ErrorResponse.builder()
                .status(HttpStatus.UNAUTHORIZED)
                .date(LocalDateTime.now())
                .message(ex.toString())
                .build();
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(error);
    }

}
