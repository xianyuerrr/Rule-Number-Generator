package com.xianyue.common.exception;

import cn.hutool.http.HttpStatus;
import com.xianyue.common.core.response.Error;
import com.xianyue.common.exception.enums.Language;
import org.slf4j.helpers.MessageFormatter;

import javax.validation.ConstraintViolationException;

/**
 * @Title: ExceptionUtils
 * @Package: com.xianyue.common.exception
 * @Description: 异常工具类
 * @Author: xianyue
 * @Date: 2023/6/17 11:40
 */
public class ExceptionUtils {
    public static final Language DEFAULT_LANGUAGE = Language.ZH;

    public static final String DEFAULT_ERROR_CODE = "100001";

    public static String getDefaultErrorCode() {
        return DEFAULT_ERROR_CODE;
    }

    public static String getErrMsgFormat(String errorCode) {
        return null;
    }

    public static Error getError(String errorCode, String sourceId, Object... args) {
        String errMsg = MessageFormatter.format(getErrMsgFormat(errorCode), args).getMessage();
        return new Error(errorCode, sourceId, errMsg, args);
    }

    public int getHttpResponseCode(Exception exception) {
        int httpStatus;
        if (exception instanceof CommonException) httpStatus = HttpStatus.HTTP_OK;
        else if (exception instanceof ConstraintViolationException) httpStatus = HttpStatus.HTTP_OK;
        else httpStatus = HttpStatus.HTTP_INTERNAL_ERROR;
        return httpStatus;
    }

    public static Language getCurrentUserLanguage() {
        return DEFAULT_LANGUAGE;
    }
}
