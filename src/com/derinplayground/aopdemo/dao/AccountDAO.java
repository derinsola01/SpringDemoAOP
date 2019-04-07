package com.derinplayground.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.derinplayground.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vipFlag) {
		System.out.println(getClass() + " :DOING MY JDBC WORK: ADDING AN ACCOUNT");
	}
}
