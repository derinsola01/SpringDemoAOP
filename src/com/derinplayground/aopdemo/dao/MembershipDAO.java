package com.derinplayground.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.derinplayground.aopdemo.Account;

@Component
public class MembershipDAO {
	
	public String addAccount(Account theAccount) {
		System.out.println(getClass() + " : DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		return "Derin return code";
	}
}
