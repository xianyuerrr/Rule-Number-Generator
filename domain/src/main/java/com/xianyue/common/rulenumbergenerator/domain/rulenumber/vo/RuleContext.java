package com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import lombok.Data;

import java.util.Collections;
import java.util.Map;

/**
 * @Title: RuleContext
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.segmentgenerator
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/15 19:30
 */
@Data
public class RuleContext {
    private RuleSegmentEntity ruleSegmentEntity;

    private Map<String, String> params = Collections.EMPTY_MAP;

    private StringBuilder curDateStr = new StringBuilder();

    private StringBuilder compositionKeyStr = new StringBuilder();
}
