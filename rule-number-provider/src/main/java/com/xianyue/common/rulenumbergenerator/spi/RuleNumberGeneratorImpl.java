package com.xianyue.common.rulenumbergenerator.spi;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Title: RuleNumberGeneratorImpl
 * @Package: com.xianyue.common.rulenumbergenerator.spi
 * @Description:
 * @Author: xianyue
 * @Date: 2023/12/31 13:41
 */
@Service
public class RuleNumberGeneratorImpl implements RuleNumberGenerator {
    @Autowired
    private RuleService ruleService;

    @Override
    public String generateRuleNumber(String bizCode, String ruleCondition, Map<String, String> params) {
        return ruleService.generateRuleNumber(bizCode, ruleCondition, params);
    }
}
