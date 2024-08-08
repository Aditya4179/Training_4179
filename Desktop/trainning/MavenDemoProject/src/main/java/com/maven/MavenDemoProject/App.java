package com.maven.MavenDemoProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.tcs.bean.ConfigDemo;
import com.org.tcs.bean.Manager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app1 =new ClassPathXmlApplicationContext("applicationContext.xml");//xml based configuration
        Manager m=(Manager)app1.getBean("manager");
        m.doWork();
        m.callMeeting();
        
    	ApplicationContext app2 = new AnnotationConfigApplicationContext(ConfigDemo.class);//Java based configuration
        Manager m1=(Manager)app2.getBean("manager");
        m1.doWork();
        m1.callMeeting();
        
    }
}
