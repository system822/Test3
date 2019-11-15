package com.wltbk.mapper;

import org.apache.ibatis.annotations.Param;

import com.wltbk.bean.XdlBankAccount;

public interface BaseAccountDao {
	XdlBankAccount findAccountByAccNoAndAccPassword(@Param("acc_no")String acc_no,@Param("acc_password")String acc_password);
}
