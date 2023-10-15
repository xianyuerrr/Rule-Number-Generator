package com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import lombok.Data;

import java.util.List;

/**
 * @Title: RuleVO
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.vo
 * @Description:
 * @Author: xianyue
 * @Date: 2023/10/14 18:48
 */
@Data
public class RuleDetail {
    private RuleEntity rule;

    private List<RuleSegmentEntity> segmentList;
}
