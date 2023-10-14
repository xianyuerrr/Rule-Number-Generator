package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber;

import cn.hutool.core.lang.Dict;
import com.xianyue.common.core.response.ApiResponse;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleService;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 Controller
 *
 * @author bishenbo
 * @date Created in 2023-06-11 19:35
 */
@Slf4j
@RequestMapping("/rulenumbergenerator")
@RestController
public class RuleController {
    @Autowired
    private RuleService ruleService;

    /**
     * 测试方法
     *
     * @param who 测试参数
     * @return {@link Dict}
     */
    @GetMapping("/findRuleById")
    public RuleEntity findRuleById(Long ruleId) {
        return ruleService.findRuleById(ruleId);
    }

    @PostMapping("/createRule")
    public ApiResponse<RuleVO> createRule(@RequestBody RuleVO ruleVO) {
        return ApiResponse.success(ruleService.createRule(ruleVO));
    }
}
