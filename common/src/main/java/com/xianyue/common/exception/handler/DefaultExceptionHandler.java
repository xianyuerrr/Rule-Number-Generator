package com.xianyue.common.exception.handler;

import com.xianyue.common.core.response.ApiResponse;
import com.xianyue.common.exception.CommonException;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @Title: DefaultExceptionHandler
 * @Package: com.xianyue.common.exception.handler
 * @Description: 默认异常处理类
 * @Author: xianyue
 * @Date: 2023/6/17 13:38
 */
@Component
public class DefaultExceptionHandler extends AbstractExceptionHandler {
    @Override
    public boolean isSupport(Exception exception) {
        return true;
    }

    @Override
    public ApiResponse handleException(Exception exception) {
        ApiResponse response = null;
        if (exception instanceof CommonException commonException) {
            if (Objects.isNull(commonException.getData())) {
                response = ApiResponse.fail(commonException.getErrorList());
            } else {
                response = ApiResponse.partialSuccess(commonException.getData(), commonException.getErrorList());
            }
        }
        this.logException(exception);
        return response;
    }

    @Override
    public int order() {
        return 10;
    }
}
