package com.xianyue.common.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Objects;

/**
 * @Title: ApiResponse
 * @Description: ApiResponse Api通用返回
 * @Author: xianyue
 * @Date: 2023/6/17 11:13
 */
@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private ReturnStatus status;

    private T data;

    private List<Error> errors;

    public ApiResponse(ReturnStatus status, T data) {
        this(status, data, null);
    }

    /**
     * 供业务代码使用
     *
     * @param data 需要返回的数据
     * @param <T> 需要返回的数据的类型
     * @return Api通用返回
     */
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse(ReturnStatus.SUCCESS, data);
    }

    /**
     * 供异常处理类使用
     *
     * @param errors 需要返回的错误信息
     * @param <T> 需要返回的数据的类型
     * @return Api通用返回
     */
    public static <T> ApiResponse<T> fail(List<Error> errors) {
        Objects.requireNonNull(errors);
        return new ApiResponse<>(ReturnStatus.ERROR, null, errors);
    }

    /**
     * 供异常处理类使用
     *
     * @param data 需要返回的数据
     * @param errors 需要返回的错误信息
     * @param <T> 需要返回的数据的类型
     * @return Api通用返回
     */
    public static <T> ApiResponse<T> partialSuccess(T data, List<Error> errors) {
        Objects.requireNonNull(errors);
        return new ApiResponse<>(ReturnStatus.PARTIAL_SUCCESS, data, errors);
    }
}
