package com.xianyue.common.exception.handler;

import com.xianyue.common.core.response.ApiResponse;

/**
 * @Title: ExceptionHandler
 * @Package: com.xianyue.common.exception
 * @Description: 异常处理接口
 * @Author: xianyue
 * @Date: 2023/6/17 13:28
 */
public interface ExceptionHandler {
    boolean isSupport(Exception exception);

    ApiResponse handleException(Exception exception);

    int order();
}
