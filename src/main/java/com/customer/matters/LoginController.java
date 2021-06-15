package com.customer.matters;


import com.customer.matters.dto.LoginDTO;
import com.customer.matters.service.AccountService;
import com.customer.matters.service.ResourceService;
import com.customer.matters.vo.ResourceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private ResourceService resourceService;

    /**
     * 用户登录接口
     * 用于验证用户登录系统,判断账户密码验证
     *
     * @param username 账户
     * @param password 密码
     * @return 刘灵
     */
    @PostMapping("login")
    public String login(String username, String password, HttpSession session,
                        RedirectAttributes attributes, Model model) {
        LoginDTO loginDTO = accountService.login(username, password);
        String error = loginDTO.getError();
        if (null == error) {
            session.setAttribute("account", loginDTO.getAccount());
            List<ResourceVO> resourceVOS = resourceService.listResourceByRoleId(loginDTO.getAccount().getRoleId());
            model.addAttribute("resource",resourceVOS);
        } else {
            attributes.addFlashAttribute("error", error);
        }
        return loginDTO.getPath();
    }

    /**
     * 退出登录
     * 跳转登录页面
     *
     * @param session
     * @return
     */
    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();

        return "redirect:/";
    }

}
