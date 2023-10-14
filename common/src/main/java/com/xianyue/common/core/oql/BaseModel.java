package com.xianyue.common.core.oql;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
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
     * 创建人
     */
    @Column(nullable = false, updatable = false)
    @CreatedBy
    private Integer createdBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(nullable = false, updatable = false)
    @CreatedDate
    private Date creationDate;

    /**
     * 上次更新人
     */

    @Column(nullable = false)
    @LastModifiedBy
    private Integer lastUpdateBy;

    /**
     * 上次更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(nullable = false)
    @LastModifiedDate
    private Date lastUpdateDate;
}
