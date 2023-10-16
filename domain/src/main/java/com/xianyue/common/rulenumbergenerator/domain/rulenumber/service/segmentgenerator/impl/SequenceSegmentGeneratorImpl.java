package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.impl;

import com.google.common.base.Strings;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentRecordEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.enums.SegmentType;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository.RuleSegmentRecordDao;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.SegmentGenerator;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @Title: SequenceSegmentGeneratorImpl
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/15 17:48
 */
@Component
public class SequenceSegmentGeneratorImpl implements SegmentGenerator {
    @Autowired
    private RuleSegmentRecordDao ruleSegmentRecordDao;

    @Transactional
    @Override
    public String generateNumber(RuleContext ruleContext) {
        RuleSegmentEntity ruleSegmentEntity = ruleContext.getRuleSegmentEntity();

        String compositionKey = ruleContext.getCompositionKeyStr().toString();
        String curDate = ruleContext.getCurDateStr().toString();

        String sequence = generateSequence(ruleSegmentEntity, compositionKey, curDate);
        int len = ruleSegmentEntity.getMaxLength() - sequence.length();
        if (len < 0) {
            return sequence.substring(-len);
        } else if (len > 0) {
            return Strings.padStart(sequence, ruleSegmentEntity.getMaxLength(), ruleSegmentEntity.getPadding());
        }
        return sequence;
    }

    public String generateSequence(RuleSegmentEntity ruleSegmentEntity, String compositionKey, String curDate) {
        RuleSegmentRecordEntity ruleSegmentRecord =
                ruleSegmentRecordDao.findRuleSegmentRecord(ruleSegmentEntity.getRuleSegmentId(), compositionKey, curDate);
        if (Objects.isNull(ruleSegmentRecord)) {
            long sequence = ruleSegmentEntity.getSequenceFrom() == null ? 0L : ruleSegmentEntity.getSequenceFrom();
            ruleSegmentRecord = new RuleSegmentRecordEntity();
            ruleSegmentRecord.setRuleSegmentId(ruleSegmentEntity.getRuleSegmentId());
            ruleSegmentRecord.setCompositionKey(compositionKey);
            ruleSegmentRecord.setCurrentDataSequence(curDate);
            ruleSegmentRecord.setCurrentSequence(sequence);
        } else {
            Long sequence = ruleSegmentRecord.getCurrentSequence() + 1;
            ruleSegmentRecord.setCurrentSequence(sequence);
        }
        ruleSegmentRecordDao.save(ruleSegmentRecord);
        return ruleSegmentRecord.getCurrentSequence().toString();
    }

    @Override
    public String getSegmentType() {
        return SegmentType.Sequence.name();
    }
}
