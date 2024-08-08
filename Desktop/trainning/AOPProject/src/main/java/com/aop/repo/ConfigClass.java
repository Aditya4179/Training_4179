package com.aop.repo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aop.repo")
@EnableAspectJAutoProxy//it will enable AOP programming
public class ConfigClass {
	
	

}
