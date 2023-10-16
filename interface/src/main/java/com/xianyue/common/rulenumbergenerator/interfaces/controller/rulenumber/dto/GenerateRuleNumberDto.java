package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import lombok.Data;

import java.util.Map;

/**
 * @Title: GenerateRuleNumberDto
 * @Package: com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/16 21:58
 */
@Data
public class GenerateRuleNumberDto {
    private String bizCode;

    private String ruleCondition;

    private Map<String, String> params;
}
