package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleDetail;

import java.util.List;
import java.util.Map;

/**
 * @Title: RuleConditionDao
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:43
 */
public interface RuleService {
    RuleDetail createRule(RuleDetail ruleDetail);

    List<RuleSegmentEntity> createRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList);

    List<RuleSegmentEntity> updateRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList);

    List<RuleSegmentEntity> cancelRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList);

    RuleEntity findRuleById(Long ruleId);

    List<RuleEntity> findRuleByIds(List<Long> ruleIdList);

    String generateRuleNumber(String bizCode, String ruleCondition, Map<String, Object> params);
}
