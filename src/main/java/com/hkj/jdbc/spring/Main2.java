package com.hkj.jdbc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g1.greet());
		
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g2.greet());
		
	}

}