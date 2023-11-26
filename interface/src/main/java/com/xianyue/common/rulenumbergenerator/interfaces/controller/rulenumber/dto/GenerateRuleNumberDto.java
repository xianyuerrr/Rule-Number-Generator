package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

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
    /**
     * 业务编码
     */
    @NotBlank
    private String bizCode;

    /**
     * 规则条件
     */
    private String ruleCondition;

    /**
     * 规则参数
     */
    private Map<String, String> params;
}
