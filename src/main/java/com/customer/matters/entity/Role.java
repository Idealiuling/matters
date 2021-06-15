package com.customer.matters.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 角色表 角色表
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 主键
     */
    private Long roleId;

    /**
     * 角色名称 角色名称
     */
    private String roleName;

    /**
     * 备注 备注
     */
    private String remark;

    /**
     * 逻辑删除 逻辑删除
     */
    private Integer delete;


}
