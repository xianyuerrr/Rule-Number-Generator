package com.xianyue.common.exception.handler;

import lombok.extern.slf4j.Slf4j;

/**
 * @Title: AbstractExceptionHandler
 * @Package: com.xianyue.common.exception.handler
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/17 13:30
 */
@Slf4j
public abstract class AbstractExceptionHandler implements ExceptionHandler {
    protected void logException(Exception exception) {
        log.error("Exception: message: {}", exception.getMessage(), exception);
    }
}
