package com.mevenk.rough.typicalwebapp.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mevenk.rough.typicalwebapp.bean.Student;

public class MainApp {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext("com.mevenk.rough.typicalwebapprough");

		Student student = (Student) context.getBean("student");

		student.getName();
		student.getAge();

		student.printThrowException();

	}
}