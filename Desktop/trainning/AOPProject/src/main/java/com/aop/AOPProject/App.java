package com.aop.AOPProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.repo.ActorRepository;
import com.aop.repo.ConfigClass;





/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
    	
    	ActorRepository act= (ActorRepository) context.getBean(ActorRepository.class);
    	act.add("Karishma");
    	act.deleteActor("Teju");
    	
    	
    	
    }
}
