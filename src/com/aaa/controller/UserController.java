package com.aaa.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aaa.biz.UserBiz;
import com.aaa.entity.User;


// 设置默认先映射到("/user")路径下
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserBiz userBiz;

	// 设置映射路径和以json格式传送参数
	@RequestMapping(value = "/checkLogin", produces = { "application/json;charset=UTF-8" })
	public @ResponseBody User checkLogin(@RequestBody User user, Model model, HttpSession session) {
		System.out.println("=============进入登录控制页面。===============");
		User user1 = userBiz.CheckLoginAndPwd(user.getUsername(), user.getPassword());
		// 登录以后添加到session中
		session.setAttribute("user1", user1);
		return user1;
	}

	// 注销
	@RequestMapping("/LogOut")
	public String LogOut(HttpSession session) {
		session.invalidate();
		return "redirect:/Login.jsp";
	}

	// 注册
	@RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST })
	public String register(User user, Model model) {
		userBiz.addUser(user);
		model.addAttribute("msg", "恭喜您,注册成功");
		return "success";
	}

}
