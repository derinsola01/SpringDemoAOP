package com.derinplayground.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount() {
		System.out.println(getClass() + " :DOING MY JDBC WORK: ADDING AN ACCOUNT");
	}
}
