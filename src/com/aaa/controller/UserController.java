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


// ����Ĭ����ӳ�䵽("/user")·����
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserBiz userBiz;

	// ����ӳ��·������json��ʽ���Ͳ���
	@RequestMapping(value = "/checkLogin", produces = { "application/json;charset=UTF-8" })
	public @ResponseBody User checkLogin(@RequestBody User user, Model model, HttpSession session) {
		System.out.println("=============�����¼����ҳ�档===============");
		User user1 = userBiz.CheckLoginAndPwd(user.getUsername(), user.getPassword());
		// ��¼�Ժ���ӵ�session��
		session.setAttribute("user1", user1);
		return user1;
	}

	// ע��
	@RequestMapping("/LogOut")
	public String LogOut(HttpSession session) {
		session.invalidate();
		return "redirect:/Login.jsp";
	}

	// ע��
	@RequestMapping(value = "/register", method = { RequestMethod.GET, RequestMethod.POST })
	public String register(User user, Model model) {
		userBiz.addUser(user);
		model.addAttribute("msg", "��ϲ��,ע��ɹ�");
		return "success";
	}

}
