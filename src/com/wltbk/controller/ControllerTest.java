package com.wltbk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wltbk.service.AccountService;

@Controller
public class ControllerTest {
	@RequestMapping("/toLogin.do")
	public String toLogin() {
		return "login";
	}
	@Autowired
	private AccountService accountService;
	@RequestMapping("/login.do")
	public String toMain(String acc_no,String acc_password,HttpServletRequest request) {
		if(acc_no != null && acc_password != null) {
			request.getSession().setAttribute("acc_no", acc_no);
			return "redirect:toMain.do";
		}
		request.getSession().setAttribute("msg", "登录失败");
		return "login";
	}
	@RequestMapping("/toMain.do")
	public String login() {
		return "main";
	}
}
