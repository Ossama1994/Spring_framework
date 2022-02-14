package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        EmailClient emailClient = applicationContext.getBean("emailClient" , EmailClient.class);

        emailClient.sendEmail("This my first message");
        emailClient.sendEmail("this my second message");
    }




}
