package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Bike;

public class NullInjectionTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory factory=null;
		Bike b=null;
		factory=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		 b=factory.getBean("bike",Bike.class);
		   System.out.println(b);
	}

}
