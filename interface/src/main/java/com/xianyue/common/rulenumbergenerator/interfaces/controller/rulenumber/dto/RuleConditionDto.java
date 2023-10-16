package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleConditionEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link RuleConditionEntity}
 */
@Data
public class RuleConditionDto implements Serializable {
    private Long ruleConditionId;
    private String bizCode;
    private String ruleCondition;
    private Long ruleId;
}
