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

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse(ReturnStatus.SUCCESS, data);
    }

    public static <T> ApiResponse<T> fail(List<Error> errors) {
        Objects.requireNonNull(errors);
        return new ApiResponse<>(ReturnStatus.ERROR, null, errors);
    }

    public static <T> ApiResponse<T> partialSuccess(T data, List<Error> errors) {
        Objects.requireNonNull(errors);
        return new ApiResponse<>(ReturnStatus.PARTIAL_SUCCESS, data, errors);
    }
}
