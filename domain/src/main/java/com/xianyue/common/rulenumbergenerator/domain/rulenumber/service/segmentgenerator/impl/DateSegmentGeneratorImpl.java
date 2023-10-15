package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.impl;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.enums.SegmentType;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.SegmentGenerator;
import org.springframework.stereotype.Component;

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
    public String generateNumber(RuleSegmentEntity ruleSegmentEntity) {
        return null;
    }

    @Override
    public String getSegmentType() {
        return SegmentType.Date.name();
    }
}
