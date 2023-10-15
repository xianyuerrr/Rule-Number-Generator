package com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleSegmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Title: RuleSegmentDao
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:44
 */
@Repository
public interface RuleSegmentDao extends JpaRepository<RuleSegmentEntity, Long> {
    List<RuleSegmentEntity> findByRuleId(@NonNull Long ruleId);

    @Transactional
    @Modifying
    @Query("update ruleSegment r set r.description = ?1 where r.ruleSegmentId = ?2")
    int updateDescriptionById(@Nullable String description, @NonNull Long id);
}
