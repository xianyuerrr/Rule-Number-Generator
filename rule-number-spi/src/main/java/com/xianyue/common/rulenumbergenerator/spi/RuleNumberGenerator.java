package com.xianyue.common.rulenumbergenerator.spi;

import java.util.Map;

/**
 * @Title: RuleNumberGenerator
 * @Package: com.xianyue.common.rulenumbergenerator.spi
 * @Description:
 * @Author: xianyue
 * @Date: 2023/12/31 13:39
 */
public interface RuleNumberGenerator {
    String generateRuleNumber(String bizCode, String ruleCondition, Map<String, String> params);
}
