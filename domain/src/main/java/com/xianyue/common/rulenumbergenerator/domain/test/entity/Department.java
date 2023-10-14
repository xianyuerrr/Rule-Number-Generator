package com.xianyue.common.rulenumbergenerator.domain.test.entity;

import com.xianyue.common.core.oql.BaseModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

/**
 * <p>
 * 部门实体类
 * </p>
 *
 * @author 76peter
 * @date Created in 2019-10-01 18:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orm_department")
@ToString(callSuper = true)
public class Department extends BaseModel {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    /**
     * 部门名
     */
    @Column(name = "name", columnDefinition = "varchar(255) not null")
    private String name;

    /**
     * 上级部门id
     */
    @ManyToOne(cascade = {CascadeType.REFRESH}, optional = true)
    @JoinColumn(name = "superior", referencedColumnName = "departmentId")
    private Department superior;
    /**
     * 所属层级
     */
    @Column(name = "levels", columnDefinition = "int not null default 0")
    private Integer levels;
    /**
     * 排序
     */
    @Column(name = "order_no", columnDefinition = "int not null default 0")
    private Integer orderNo;
    /**
     * 子部门集合
     */
    @OneToMany(cascade = {CascadeType.REFRESH, CascadeType.REMOVE}, fetch = FetchType.EAGER, mappedBy = "superior")
    private Collection<Department> children;

    /**
     * 部门下用户集合
     */
    @ManyToMany(mappedBy = "departmentList")
    private Collection<User> userList;
}
