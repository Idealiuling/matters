package com.customer.matters.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResourceVO {
    /**
     * 主键 主键
     */
    private Long resourceId;

    /**
     * 资源名称 资源名称
     */
    private String resourceName;


    /**
     * 请求地址 请求地址
     */
    private String url;
    /**
     * 下级资源
     * 二级资源
     */
    private List<ResourceVO> subs;



}
