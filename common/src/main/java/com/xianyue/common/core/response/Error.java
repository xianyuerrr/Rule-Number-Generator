package com.xianyue.common.core.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Title: Error
 * @Description: ApiResponse 返回错误类型
 * @Author: xianyue
 * @Date: 2023/6/17 11:13
 */
@Getter
@AllArgsConstructor
public class Error {
    private String errorCode;

    private String errorMsg;

    private String sourceId;
}
