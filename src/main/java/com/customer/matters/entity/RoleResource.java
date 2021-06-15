package com.customer.matters.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 角色资源表 角色资源表
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 主键
     */
    private Long roleResourceId;

    /**
     * 角色id 角色id
     */
    private Long roleId;

    /**
     * 资源id 资源id
     */
    private Long resourceId;


}
