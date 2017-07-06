package com.norbert.helloworld.controller;

public class HelloBean {
	private String name;
	private String company;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void printHello() {
		System.out.println("Hello "+ name);
	}
	
	public void printComp() {
		System.out.println("You work with "+company);
	}
}
