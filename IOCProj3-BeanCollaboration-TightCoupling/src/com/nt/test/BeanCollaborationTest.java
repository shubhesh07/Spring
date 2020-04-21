package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class BeanCollaborationTest {

	public static void main(String[] args) {
		 Flipkart fpkt=null;
		 BeanFactory factory=null;
		//Create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//Get target class object
		fpkt=factory.getBean("fpkt",Flipkart.class);
		//Invoke Mthod
		System.out.println(fpkt.shopping(new String[] {"shirt","mobile","books"} ,new float[] {2000,3000,5000}));
}
}