package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.impl;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.enums.SegmentType;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.SegmentGenerator;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Title: DateSegmentGeneratorImpl
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/15 17:47
 */
@Component
public class DateSegmentGeneratorImpl implements SegmentGenerator {
    @Override
    public String generateNumber(RuleContext ruleContext) {
        RuleSegmentEntity ruleSegmentEntity = ruleContext.getRuleSegmentEntity();
        String format = ruleSegmentEntity.getFormat();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        String segmentStr = localDateTime.format(dateTimeFormatter);

        ruleContext.getCurDateStr().append(segmentStr);

        return segmentStr;
    }

    @Override
    public String getSegmentType() {
        return SegmentType.Date.name();
    }
}