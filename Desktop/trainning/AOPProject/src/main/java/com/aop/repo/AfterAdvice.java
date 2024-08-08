package com.aop.repo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAdvice {
	
	@After("execution (* com.aop.repo.*.add(..))")
	public void allDaoAddMethod(JoinPoint joinPoint) {
		System.out.println("Intercepted method : "+joinPoint);
		System.out.println("Arguments : "+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	
	@After("execution (* com.aop.repo.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint){
		System.out.println("Intercepted method : "+joinPoint);
		System.out.println("Arguments : "+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}

}
