package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link RuleEntity}
 */
@Data
public class RuleDto implements Serializable {
    Long ruleId;
    String ruleName;
    String description;
    String enableFlag;
}
