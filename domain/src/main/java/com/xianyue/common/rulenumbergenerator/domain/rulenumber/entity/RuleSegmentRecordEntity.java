package com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity;

import com.xianyue.common.core.oql.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @Title: RuleSegmentRecordEntity
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:39
 */
@Data
@Entity(name = "ruleSegmentRecord")
@Table(name = "tbl_number_generator_rule_sequence_record", schema = "rulenumbergenerator")
public class RuleSegmentRecordEntity extends BaseModel {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ruleSegmentRecordId;

    @Column(nullable = false)
    private Long ruleSegmentId;

    @Column(nullable = false)
    private String compositionKey;

    private String currentDataSequence;

    private Long currentSequence;
}
