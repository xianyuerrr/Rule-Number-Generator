package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleDetail;
import org.springframework.cache.annotation.Cacheable;

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

    List<RuleSegmentEntity> createRuleSegment(RuleDetail ruleDetail);

    List<RuleSegmentEntity> updateRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList);

    void cancelRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList);

    @Cacheable(key = "#ruleId", value = "ruleDetail")
    RuleDetail findRuleById(Long ruleId);

    List<RuleEntity> findRuleByIdList(List<Long> ruleIdList);

    String generateRuleNumber(String bizCode, String ruleCondition, Map<String, String> params);
}
