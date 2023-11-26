package com.xianyue.common.rulenumbergenerator.interfaces.controller.rulenumber.dto;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo.RuleDetail;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * DTO for {@link RuleDetail}
 */
@Data
public class RuleDetailDto {
    @NotNull
    RuleDto rule;

    @NotEmpty
    List<RuleSegmentDto> segmentList;
}
