package com.customer.matters.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 账号表
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Account extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键 主键
     */
    private Long accountId;

    /**
     * 用户id 用户id
     */
    private Long roleId;

    /**
     * 用户名 用户名
     */
    private String username;

    /**
     * 密码 密码
     */
    private String password;

    /**
     * 加密盐 加密盐
     */
    private String salt;

    /**
     * 真实名字 真实名字
     */
    private String realName;

    /**
     * 性别 性别
     */
    private String sex;

    /**
     * 邮箱 邮箱
     */
    private String email;


}
