package com.customer.matters.entity;

import com.customer.matters.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 客户表 客户表
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 主键
     */
    private Integer customerId;

    /**
     * 真实名字 真实名字
     */
    private Integer realName;

    /**
     * 性别 性别
     */
    private Integer sex;

    /**
     * 年龄 年龄
     */
    private Integer age;

    /**
     * 邮箱 邮箱
     */
    private String email;

    /**
     * 手机号码 手机号码
     */
    private String phone;

    /**
     * 地址 地址
     */
    private String address;


}
