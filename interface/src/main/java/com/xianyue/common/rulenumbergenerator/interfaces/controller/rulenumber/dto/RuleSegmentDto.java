package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link RuleSegmentEntity}
 */
@Data
public class RuleSegmentDto implements Serializable {
    Long ruleSegmentId;
    Long ruleId;
    Integer segmentIdx;
    String segmentName;
    String description;
    Integer maxLength;
    String segmentType;
    String text;
    String formatKey;
    String attributeName;
    String attributeClz;
    Long sequenceTo;
    Long sequenceFrom;
    String padding;
    String independentSequence;
}
