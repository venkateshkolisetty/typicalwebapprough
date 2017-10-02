package com.mevenk.rough.typicalwebapp.bean;

import com.mevenk.rough.typicalwebapp.config.TypicalWebAppSourceBean;

public class Student extends TypicalWebAppSourceBean {
	private Integer age;
	private String name;

	public Student(String beanName, Integer age, String name) {
		super(beanName);
		this.age = age;
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		System.out.println("Age : " + age);
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		System.out.println("Name : " + name);
		return name;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}