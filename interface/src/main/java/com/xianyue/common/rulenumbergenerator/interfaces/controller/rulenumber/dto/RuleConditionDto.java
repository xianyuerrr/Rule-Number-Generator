package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleConditionEntity;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * DTO for {@link RuleConditionEntity}
 */
@Data
public class RuleConditionDto {
    private Long ruleConditionId;

    /**
     * 业务编码
     */
    @NotBlank
    private String bizCode;
    private String ruleCondition;

    /**
     * 规则ID
     */
    @NotNull
    private Long ruleId;
}
