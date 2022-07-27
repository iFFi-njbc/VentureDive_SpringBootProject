package com.SpringFramework.spring1.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.SpringFramework.spring1.javaConfig")
public class javaConfig {
	
	
	@Bean
	public Address getAddress()
	{
		Address ad = new Address("Madina", "Lahore");
		return ad;
	}
	
	@Bean(name="student")
	public Student getStudent()
	{
		Student student = new Student("ifrah",123,getAddress());
		return student;
	}
	

}
