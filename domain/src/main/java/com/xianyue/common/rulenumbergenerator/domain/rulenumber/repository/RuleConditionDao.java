package com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleConditionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Title: RuleConditionDao
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:43
 */
@Repository
public interface RuleConditionDao extends JpaRepository<RuleConditionEntity, Long> {
    @Query("""
            select r from ruleCondition r
            where r.bizCode = ?1 and r.ruleCondition = ?2 and r.ruleId = ?3
            order by r.creationDate DESC""")
    List<RuleConditionEntity> findRuleConditionList(String bizCode, String ruleCondition, Long ruleId);

    RuleConditionEntity findByBizCodeAndRuleCondition(String bizCode, String ruleCondition);
}
