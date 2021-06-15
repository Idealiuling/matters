package com.customer.matters.service.impl;

import cn.hutool.crypto.digest.MD5;
import com.customer.matters.dto.LoginDTO;
import com.customer.matters.entity.Account;
import com.customer.matters.dao.AccountMapper;
import com.customer.matters.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * <p>
 * 账号表 服务实现类
 * </p>
 *
 * @author liuling
 * @since 2021-05-25
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public LoginDTO login(String username, String password) {
      LoginDTO loginDTO = new LoginDTO();
      loginDTO.setPath("redirect:/");
       Account account= lambdaQuery().eq(Account::getUsername ,username).one();
        if (account ==null){
        loginDTO.setError("用户名不存在");
        return loginDTO;
        }
     MD5 md5 =new MD5(account.getSalt().getBytes());
     String digestHex = md5.digestHex(password);
       if (!digestHex.equals(account.getPassword())){
           loginDTO.setError("密码错误。请重新输入");
           return  loginDTO;
       }
       System.out.println("登录成功");
       loginDTO.setAccount(account);
       loginDTO.setPath("login/main");
       return loginDTO;
    }

    /**
     * 退出方法
     * @param session
     * @return
     */
    @GetMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}
