package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository.RuleDao;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository.RuleSegmentDao;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleService;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleDetail;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @Title: RuleServiceImpl
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl
 * @Description:
 * @Author: xianyue
 * @Date: 2023/9/25 22:25
 */
@Data
@Service
public class RuleServiceImpl implements RuleService {

    @Autowired
    private final RuleDao ruleDao;

    @Autowired
    private final RuleSegmentDao ruleSegmentDao;

    @Override
    public RuleDetail createRule(RuleDetail ruleDetail) {
        RuleEntity ruleEntity = ruleDao.save(ruleDetail.getRule());
        ruleDetail.getSegmentList().forEach(ruleSegmentEntity -> ruleSegmentEntity.setRuleId(ruleEntity.getRuleId()));
        ruleSegmentDao.saveAll(ruleDetail.getSegmentList());
        return ruleDetail;
    }

    @Override
    public List<RuleSegmentEntity> createRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList) {
        return ruleSegmentDao.saveAll(ruleSegmentEntityList);
    }

    @Override
    public List<RuleSegmentEntity> updateRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList) {
        return ruleSegmentDao.saveAll(ruleSegmentEntityList);
    }

    @Override
    public List<RuleSegmentEntity> cancelRuleSegment(List<RuleSegmentEntity> ruleSegmentEntityList) {
        return ruleSegmentDao.saveAll(ruleSegmentEntityList);
    }

    @Override
    public RuleDetail findRuleById(Long ruleId) {
        Optional<RuleEntity> byId = ruleDao.findById(ruleId);
        if (byId.isEmpty()) {
            return null;
        }
        RuleEntity ruleEntity = byId.get();
        List<RuleSegmentEntity> ruleSegmentEntityList = ruleSegmentDao.findByRuleId(ruleEntity.getRuleId());
        RuleDetail ruleDetail = new RuleDetail();
        ruleDetail.setRule(ruleEntity);
        ruleDetail.setSegmentList(ruleSegmentEntityList);
        return ruleDetail;
    }

    @Override
    public List<RuleEntity> findRuleByIds(List<Long> ruleIdList) {
        return ruleDao.findAllById(ruleIdList);
    }

    @Override
    public String generateRuleNumber(String bizCode, String ruleCondition, Map<String, Object> params) {
        return null;
    }
}
