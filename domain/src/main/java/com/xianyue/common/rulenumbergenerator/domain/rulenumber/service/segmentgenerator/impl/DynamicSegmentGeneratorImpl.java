package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.impl;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.enums.SegmentType;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator.SegmentGenerator;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Title: DynamicSegmentGeneratorImpl
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.impl
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/15 17:48
 */
@Component
public class DynamicSegmentGeneratorImpl implements SegmentGenerator {
    @Override
    public String generateNumber(RuleContext ruleContext) {
        RuleSegmentEntity ruleSegmentEntity = ruleContext.getRuleSegmentEntity();
        Map<String, String> params = ruleContext.getParams();
        String segmentStr = params.get(ruleSegmentEntity.getAttributeClz());

        ruleContext.getCompositionKeyStr().append(segmentStr);

        return segmentStr;
    }

    @Override
    public String getSegmentType() {
        return SegmentType.Dynamic.name();
    }
}
