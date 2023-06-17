package com.xianyue.common.exception;

import cn.hutool.core.collection.CollectionUtil;
import com.xianyue.common.core.response.Error;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Title: CommonException
 * @Package: com.xianyue.common.exception
 * @Description: 通用异常类
 * @Author: xianyue
 * @Date: 2023/6/17 11:23
 */
@Getter
public class CommonException extends RuntimeException {
    private Object data;

    private final List<Error> errorList;

    public CommonException(String errorCode, String sourceId, Throwable cause, Object... args) {
        super(errorCode, cause);
        errorList = Collections.singletonList(ExceptionUtils.getError(errorCode, sourceId, args));
    }

    public CommonException(List<Error> errorList) {
        this(errorList, null);
    }

    public CommonException(List<Error> errorList, Object data) {
        this(errorList, null, data);
    }

    public CommonException(List<Error> errorList, Throwable cause, Object data) {
        super("", cause);
        this.data = data;
        this.errorList = CollectionUtil.isEmpty(errorList) ? Collections.emptyList() : errorList;
    }

    @Override
    public String getMessage() {
        return getErrorList().stream().map(Error::getErrorMsg).collect(Collectors.joining("\\n"));
    }
}
