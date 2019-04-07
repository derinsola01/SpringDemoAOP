package com.derinplayground.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
//	Matches with method that matches exact object and any otber list of methods. (From zero to infinity)
	@Before("execution(* add*(com.derinplayground.aopdemo.Account, ..))")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======> Executing the before advice on addAccount");
	}
}
