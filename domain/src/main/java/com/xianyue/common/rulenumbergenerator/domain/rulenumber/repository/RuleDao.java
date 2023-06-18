package com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository;

import com.xianyue.common.rulenumbergenerator.domain.rulenumber.entity.RuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Title: RuleDao
 * @Package: com.xianyue.common.rulenumbergenerator.domain.rulenumber.repository
 * @Description:
 * @Author: xianyue
 * @Date: 2023/6/18 10:42
 */
@Repository
public interface RuleDao extends JpaRepository<RuleEntity, Long> {
}
