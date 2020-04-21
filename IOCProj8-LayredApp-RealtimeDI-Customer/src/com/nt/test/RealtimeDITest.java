package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.CustomerController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		CustomerController controller=null;
		Scanner sc=null;
		String no=null,name=null,addrs=null,pamt=null,rate=null,time=null;
		CustomerVO vo=null;
		//create IOc container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Controller
		controller= factory.getBean("controller",CustomerController.class);
		//read inputs from enduser
		sc=new Scanner(System.in);
		System.out.println("Enter Customer Number::");
		no=sc.next();
		System.out.println("Enter Customer Name::");
		name=sc.next();
		System.out.println("Enter Customer Address::");
		addrs=sc.next();
		System.out.println("Enter Principal Amount");
		pamt=sc.next();
		System.out.println("Enter Rate");
		rate=sc.next();
		System.out.println("Enter Time");
		time=sc.next();
		//create StudentVO class obj
		vo=new CustomerVO();
		vo.setCustNo(no);
		vo.setCustName(name);
		vo.setCustAddrs(addrs);
		vo.setpAmt(pamt);vo.setRate(rate);vo.setTime(time);
		
		//invoking method
		try{
			System.out.println("Result::::"+controller.process(vo));
		}
		catch(Exception e){
			System.out.println("Internal Problem::"+e.getMessage());
		}

	}//main
}//class
