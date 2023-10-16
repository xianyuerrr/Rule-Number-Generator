package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber;

import com.xianyue.common.core.response.ApiResponse;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleConditionService;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.service.RuleService;
import com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.convertor.RuleConditionMapper;
import com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.convertor.RuleDetailMapper;
import com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto.GenerateRuleNumberDto;
import com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto.RuleConditionDto;
import com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto.RuleDetailDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

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

    @Autowired
    private RuleConditionService ruleConditionService;

    @Autowired
    private RuleDetailMapper ruleDetailMapper;

    @Autowired
    private RuleConditionMapper ruleConditionMapper;

    @GetMapping("/findRuleById")
    public ApiResponse<RuleDetailDto> findRuleById(Long ruleId) {
        return ApiResponse.success(ruleDetailMapper.convert(ruleService.findRuleById(ruleId)));
    }

    @PostMapping("/createRule")
    public ApiResponse<RuleDetailDto> createRule(@RequestBody RuleDetailDto ruleDetail) {
        return ApiResponse.success(ruleDetailMapper.convert(ruleService.createRule(ruleDetailMapper.convertReserve(ruleDetail))));
    }

    @PostMapping("/generateRuleNumber")
    public ApiResponse<String> generateRuleNumber(@RequestBody GenerateRuleNumberDto generateRuleNumberDto) {
        return ApiResponse.success(ruleService.generateRuleNumber(generateRuleNumberDto.getBizCode(),
                generateRuleNumberDto.getRuleCondition(), generateRuleNumberDto.getParams()));
    }

    @GetMapping("/findRuleCondition")
    public ApiResponse<Collection<RuleConditionDto>> findRuleCondition(RuleConditionDto ruleConditionDto) {
        return ApiResponse.success(ruleConditionMapper.convert(
                ruleConditionService.findRuleCondition(ruleConditionMapper.convertReserve(ruleConditionDto))));
    }

    @PostMapping("/createRuleCondition")
    public ApiResponse<Collection<RuleConditionDto>> createRuleCondition(@RequestBody List<RuleConditionDto> ruleConditionDtoList) {
        return ApiResponse.success(ruleConditionMapper.convert(ruleConditionService.createRuleCondition(ruleConditionMapper.convertReserve(ruleConditionDtoList))));
    }
}
