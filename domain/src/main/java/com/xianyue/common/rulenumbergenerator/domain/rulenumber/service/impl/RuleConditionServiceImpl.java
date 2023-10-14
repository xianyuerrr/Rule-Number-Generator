package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleConditionEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository.RuleConditionDao;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleConditionService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title: RuleConditionServiceImpl
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl
 * @Description:
 * @Author: xianyue
 * @Date: 2023/9/25 22:26
 */
@Data
@Service
public class RuleConditionServiceImpl implements RuleConditionService {
    @Autowired
    private final RuleConditionDao ruleConditionDao;

    @Override
    public RuleConditionEntity findRuleConditionById(Long ruleConditionId) {
        return ruleConditionDao.findById(ruleConditionId).get();
    }

    @Override
    public List<RuleConditionEntity> findRuleConditionByIds(List<Long> ruleConditionIdList) {
        return ruleConditionDao.findAllById(ruleConditionIdList);
    }

    @Override
    public List<RuleConditionEntity> createRuleCondition(List<RuleConditionEntity> ruleConditionEntityList) {
        return ruleConditionDao.saveAll(ruleConditionEntityList);
    }

    @Override
    public List<RuleConditionEntity> updateRuleCondition(List<RuleConditionEntity> ruleConditionEntityList) {
        return ruleConditionDao.saveAll(ruleConditionEntityList);
    }
}
