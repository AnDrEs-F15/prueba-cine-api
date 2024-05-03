package com.cinema.domain.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AppException.class)
    public ResponseEntity<AppExceptionResponseDto> appException (AppException exception){
        AppExceptionResponseDto responseDto = new AppExceptionResponseDto(
                exception.getMessage(),
                exception.getHttpStatus()
        );
        return new ResponseEntity<>(responseDto,exception.getHttpStatus());
    }
}
