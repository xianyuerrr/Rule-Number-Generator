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
 * @Title: Rule
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/17 23:02
 */
@Data
@Entity(name = "rule")
@Table(name = "tbl_number_generator_rule", schema = "rulenumbergenerator")
public class RuleEntity extends BaseModel {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ruleId;

    @Column(length = 80)
    private String ruleName;

    @Column(length = 500)
    private String description;

    @Column(length = 1)
    private String enableFlag;
}
