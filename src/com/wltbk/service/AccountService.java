package com.wltbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wltbk.bean.XdlBankAccount;
import com.wltbk.mapper.BaseAccountDao;
@Service("as")
public class AccountService {
	@Autowired
	private BaseAccountDao baseAccountDao;
	public XdlBankAccount login(String acc_no,String acc_password) {
		return baseAccountDao.findAccountByAccNoAndAccPassword(acc_no, acc_password);
	}

	
}
