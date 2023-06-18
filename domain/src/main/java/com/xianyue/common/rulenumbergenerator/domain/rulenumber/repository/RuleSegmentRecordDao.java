package com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: RuleSegmentRecordDao
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:44
 */
@Repository
public interface RuleSegmentRecordDao extends JpaRepository<RuleSegmentRecordEntity, Long> {
}
