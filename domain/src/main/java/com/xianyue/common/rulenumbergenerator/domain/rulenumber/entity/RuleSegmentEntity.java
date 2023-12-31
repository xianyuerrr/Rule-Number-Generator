package com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity;

import com.xianyue.common.oql.core.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @Title: RuleSegment
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity
 * @Description: 规则段表
 * @Author: xianyue
 * @Date: 2023/6/18 10:22
 */
@Data
@Entity(name = "ruleSegment")
@Table(name = "tbl_number_generator_rule_segment", schema = "rulenumbergenerator")
public class RuleSegmentEntity extends BaseModel {
    @Column(nullable = false, updatable = false)
    private Long ruleId;

    @Column(nullable = false)
    private Integer segmentIdx;

    private String segmentName;

    private String description;

    @Column(nullable = false)
    private Integer maxLength;

    @Column(nullable = false)
    private String segmentType;

    private String text;

    private String formatKey;

    private String attributeName;

    private String attributeClz;

    private Long sequenceTo;

    private Long sequenceFrom;

    private String padding;

    private String independentSequence;
}
