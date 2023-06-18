package com.xianyue.common.exception.handler;

import com.xianyue.common.core.response.ApiResponse;
import org.springframework.stereotype.Component;

import javax.validation.ValidationException;

/**
 * @Title: ValidationExceptionHandler
 * @Package: com.xianyue.common.exception.handler
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 11:30
 */
@Component
public class ValidationExceptionHandler extends AbstractExceptionHandler {
    @Override
    public boolean isSupport(Exception exception) {
        return exception instanceof ValidationException;
    }

    @Override
    public ApiResponse handleException(Exception exception) {
        return null;
    }

    @Override
    public int order() {
        return 0;
    }
}
