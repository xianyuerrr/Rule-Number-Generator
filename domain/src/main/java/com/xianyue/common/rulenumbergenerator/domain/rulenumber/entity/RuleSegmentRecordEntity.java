package com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity;

import com.xianyue.common.core.oql.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * @Title: RuleSegmentRecordEntity
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:39
 */
@Entity(name = "ruleSegmentRecord")
@Table(name = "tbl_number_generator_rule_sequence_record", schema = "rulenumbergenerator")
public class RuleSegmentRecordEntity extends BaseModel {
    @Column(nullable = false)
    private Long ruleSegmentId;

    @Column(nullable = false)
    private String compositionKey;

    private String currentDataSequence;

    private Long currentSequence;
}
