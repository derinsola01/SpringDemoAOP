package com.derinplayground.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
//	@Before("execution(public void add*())")
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======> Executing the before advice on addAccount");
	}
}
