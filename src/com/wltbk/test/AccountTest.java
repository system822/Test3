package com.wltbk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wltbk.service.AccountService;

public class AccountTest {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService as = app.getBean("as",AccountService.class);
		System.out.println(as.login("小白", "qwer"));
	}

}
