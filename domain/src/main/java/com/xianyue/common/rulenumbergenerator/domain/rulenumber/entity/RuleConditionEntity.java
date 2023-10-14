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
 * @Title: RuleCondition
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 0:19
 */

@Data
@Entity(name = "ruleCondition")
@Table(name = "tbl_number_generator_rule_condition", schema = "rulenumbergenerator")
public class RuleConditionEntity extends BaseModel {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ruleConditionId;

    @Column(nullable = false)
    private String bizCode;

    private String ruleCondition;

    @Column(nullable = false)
    private Long ruleId;
}
