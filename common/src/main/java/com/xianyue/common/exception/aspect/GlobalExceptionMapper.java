package com.xianyue.common.exception.aspect;

import com.xianyue.common.core.response.ApiResponse;
import com.xianyue.common.exception.handler.ExceptionProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @Title: GlobalExceptionMapper
 * @Package: com.xianyue.common.exception.aspect
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/17 22:09
 */
@RestControllerAdvice
public class GlobalExceptionMapper extends ResponseEntityExceptionHandler {
    @Autowired
    private ExceptionProcessor exceptionProcessor;

    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<Object> handleConflict(RuntimeException exception, WebRequest request) {
        ApiResponse response = exceptionProcessor.handleException(exception);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
