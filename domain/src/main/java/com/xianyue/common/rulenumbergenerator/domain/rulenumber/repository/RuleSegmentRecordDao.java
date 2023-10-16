package com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
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
    @Query("""
            select r from ruleSegmentRecord r
            where r.ruleSegmentId = ?1 and r.compositionKey = ?2 and r.currentDataSequence = ?3""")
    RuleSegmentRecordEntity findRuleSegmentRecord(@NonNull Long ruleSegmentId, @NonNull String compositionKey, @NonNull String currentDataSequence);
}
