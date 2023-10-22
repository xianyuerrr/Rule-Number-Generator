package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * DTO for {@link RuleEntity}
 */
@Data
public class RuleDto {
    private Long ruleId;

    @NotBlank
    private String ruleName;

    private String description;

    private String enableFlag;
}
