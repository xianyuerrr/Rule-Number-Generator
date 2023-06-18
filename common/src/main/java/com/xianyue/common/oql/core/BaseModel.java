package com.xianyue.common.oql.core;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 实体通用父类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-11-07 14:01
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建人
     */
    @Column(name = "created_by", nullable = false, updatable = false)
    @CreatedBy
    private Integer createdBy;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIME)
    @Column(name = "creation_date", nullable = false, updatable = false)
    @CreatedDate
    private Date creationDate;

    /**
     * 上次更新人
     */

    @Column(name = "last_update_by", nullable = false)
    @LastModifiedBy
    private Integer lastUpdateBy;

    /**
     * 上次更新时间
     */
    @Temporal(TemporalType.TIME)
    @Column(name = "last_update_date", nullable = false)
    @LastModifiedDate
    private Date lastUpdateDate;
}
