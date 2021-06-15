package com.customer.matters.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 资源表 资源表
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 主键
     */
    private Long resourceId;

    /**
     * 父id 父id
     */
    private Long parentId;

    /**
     * 资源名称 资源名称
     */
    private String resourceName;

    /**
     * 资源类型 资源类型
     */
    private Integer resourceType;

    /**
     * 请求地址 请求地址
     */
    private String url;

    /**
     * 权限标识码 权限标识码
     */
    private String code;

    /**
     * 排序 排序
     */
    private Integer sort;


}
