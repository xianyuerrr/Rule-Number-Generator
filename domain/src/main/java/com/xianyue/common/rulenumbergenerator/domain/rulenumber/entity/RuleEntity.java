package com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity;

import com.xianyue.common.oql.core.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
    @Column(length = 80)
    private String ruleName;

    @Column(length = 500)
    private String description;

    @Column(length = 1)
    private String enableFlag;
}
