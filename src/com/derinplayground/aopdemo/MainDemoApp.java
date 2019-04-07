package com.derinplayground.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.derinplayground.aopdemo.dao.AccountDAO;
import com.derinplayground.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		Account myAccount = new Account();
		boolean derinFlag = false;
		theAccountDAO.addAccount(myAccount, derinFlag);
		System.out.println("Call the method again...");
		theAccountDAO.addAccount(myAccount, derinFlag);
		
		System.out.println("\n\nCALLING MEMBERSHIP DAO AOP");
		theMembershipDAO.addAccount(myAccount);
		System.out.println("Call the method again...");
		theMembershipDAO.addAccount(myAccount);
		
		context.close();
	}

}
