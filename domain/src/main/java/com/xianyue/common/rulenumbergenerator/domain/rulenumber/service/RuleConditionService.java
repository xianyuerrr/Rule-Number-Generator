package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleConditionEntity;

import java.util.Collection;
import java.util.List;

/**
 * @Title: RuleConditionDao
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:43
 */
public interface RuleConditionService {
    List<RuleConditionEntity> findRuleCondition(RuleConditionEntity ruleConditionEntity);

    List<RuleConditionEntity> createRuleCondition(Collection<RuleConditionEntity> ruleConditionEntityList);

    List<RuleConditionEntity> updateRuleCondition(List<RuleConditionEntity> ruleConditionEntityList);
}
