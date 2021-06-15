package com.customer.matters.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.customer.matters.dto.LoginDTO;
import com.customer.matters.entity.Account;

/**
 * <p>
 * 账号表 服务类
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
public interface AccountService extends IService<Account> {

    LoginDTO login(String username, String password);

}
