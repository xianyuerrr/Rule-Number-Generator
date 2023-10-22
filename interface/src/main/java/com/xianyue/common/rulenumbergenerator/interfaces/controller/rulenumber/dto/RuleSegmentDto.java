package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * DTO for {@link RuleSegmentEntity}
 */
@Data
public class RuleSegmentDto implements Serializable {
    private Long ruleSegmentId;

    @NotNull
    private Long ruleId;

    @NotNull
    private Integer segmentIdx;

    @NotNull
    private String segmentName;

    private String description;

    @NotNull
    private Integer maxLength;

    @NotBlank
    private String segmentType;

    private String text;

    private String format;

    private String attributeName;

    private String attributeClz;

    private Long sequenceTo;

    private Long sequenceFrom;

    private String padding;

    private String independentSequence;
}
