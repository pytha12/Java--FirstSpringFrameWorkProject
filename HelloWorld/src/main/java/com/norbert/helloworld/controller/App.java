package com.norbert.helloworld.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		
		HelloBean obj = (HelloBean) context.getBean("helloBeany");
		obj.printHello();
		obj.printComp();
	}
}
