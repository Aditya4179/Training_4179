package com.aop.repo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAdvice {
	
	//1. we can use JointPoint as a parameter in advice method 
	//and using it to get the method signature or to get target object.
	//2. we can use arg method in the point to be applied to any method that matches 
	//the argument pattern.
	//3. if we use this we need to use the same name in the advice method from where 
	//the argument type is determined.
	//we are putting pointcut(packagename) and beforeAdvice(methodName)
	//pointCut or execution- @PointCut means mark a function as a pointcut
	//execution expression is covering method on which advice to be applied
	@Before("execution (* com.aop.repo.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted Method : "+joinPoint);
		System.out.println("Arguments : "+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	
	@Before("execution(* com.aop.repo.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint) {
		System.out.println("Intercepted method "+joinPoint);
		System.out.println("Arguments : "+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}

}
