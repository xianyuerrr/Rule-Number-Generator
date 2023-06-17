package com.xianyue.common.exception;

import cn.hutool.core.collection.CollectionUtil;
import com.xianyue.common.core.response.Error;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

/**
 * @Title: CommonException
 * @Package: com.xianyue.common.exception
 * @Description: 通用异常类
 * @Author: xianyue
 * @Date: 2023/6/17 11:23
 */
public class CommonException extends RuntimeException {
    @Getter
    private final List<Error> errorList;

    public CommonException(String errorCode, String sourceId, Throwable cause, Object... args) {
        super(errorCode, cause);
        errorList = Collections.singletonList(ExceptionUtils.getError(errorCode, sourceId, args));
    }

    public CommonException(List<Error> errorList) {
        this(errorList, null);
    }

    public CommonException(List<Error> errorList, Throwable cause) {
        super("", cause);
        this.errorList = CollectionUtil.isEmpty(errorList) ? Collections.emptyList() : errorList;
    }
}
