package com.tecsup.minishop.controller;
import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.ExceptionHandler; import org.springframework.web.bind.annotation.ResponseStatus; import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice public class ApiExceptionHandler { @ExceptionHandler(RuntimeException.class) @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR) public String handleRuntimeException(RuntimeException ex){ return ex.getMessage(); } }
