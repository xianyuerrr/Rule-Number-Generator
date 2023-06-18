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
    /**
     * 错误码
     */
    private String errorCode;


    /**
     * 来源对象Id
     */
    private String sourceId;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 错误上下文参数
     */
    private Object[] args;
}
