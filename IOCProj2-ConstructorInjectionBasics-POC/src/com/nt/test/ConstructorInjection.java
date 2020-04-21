package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

@SuppressWarnings("deprecation")
public class ConstructorInjection {

	
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishGenerator generator=null;
		//create IOC Container
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		
		//Locate and hold spring beans configuration file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//Create bean Factory IOC COntainer
		factory=new XmlBeanFactory(res);
		//get Target Bean class object
		obj=factory.getBean("wmg");
		//type casting
		generator=(WishGenerator)obj;
		//invoke b.method
		System.out.println("Result::"+generator.generateMessage("Raja"));
	}//main

}//class
