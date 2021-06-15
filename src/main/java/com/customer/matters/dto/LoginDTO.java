package com.customer.matters.dto;

import com.customer.matters.entity.Account;
import lombok.Data;

@Data
public class LoginDTO {
    /**
     * 重定向的路径
     */
    private String path;
    /**
     * 错误信息
     */
    private String error;

    /**
     * 当前登录人的信息
     */
    private Account account;

}
