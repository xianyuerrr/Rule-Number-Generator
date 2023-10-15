package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.convertor;

import com.xianyue.common.convertor.CommonConverter;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleDetail;
import com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto.RuleDetailDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

/**
 * @Title: RuleDetailMapper
 * @Package: com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.convertor
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/15 11:37
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RuleDetailMapper extends CommonConverter<RuleDetail, RuleDetailDto> {
}
