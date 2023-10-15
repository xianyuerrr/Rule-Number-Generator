package com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;

/**
 * @Title: SegmentGenerator
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/15 16:28
 */
public interface SegmentGenerator {
    String generateNumber(RuleSegmentEntity ruleSegmentEntity);

    String getSegmentType();
}
