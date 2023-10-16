package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleConditionEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository.RuleConditionDao;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleConditionService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
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
    public List<RuleConditionEntity> findRuleCondition(RuleConditionEntity ruleConditionEntity) {
        return ruleConditionDao.findAll(Example.of(ruleConditionEntity), Sort.by(Sort.Order.desc("creationDate")));
    }

    @Override
    public List<RuleConditionEntity> createRuleCondition(Collection<RuleConditionEntity> ruleConditionEntityList) {
        return ruleConditionDao.saveAll(ruleConditionEntityList);
    }

    @Override
    public List<RuleConditionEntity> updateRuleCondition(List<RuleConditionEntity> ruleConditionEntityList) {
        return ruleConditionDao.saveAll(ruleConditionEntityList);
    }
}
