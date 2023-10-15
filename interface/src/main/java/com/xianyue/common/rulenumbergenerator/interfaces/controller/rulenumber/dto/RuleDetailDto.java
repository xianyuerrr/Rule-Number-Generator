package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleDetail;
import lombok.Data;

import java.util.List;

/**
 * DTO for {@link RuleDetail}
 */
@Data
public class RuleDetailDto {
    RuleDto rule;

    List<RuleSegmentDto> segmentList;
}
