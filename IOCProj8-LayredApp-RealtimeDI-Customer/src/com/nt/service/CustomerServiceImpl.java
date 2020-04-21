package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;
import com.nt.controller.*;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO dao;
	public CustomerServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public String CustomerRegister(CustomerDTO dto) throws Exception {
		float interest=(dto.getpAmt()*dto.getRate()*dto.getTime()/100);
		CustomerBO bo=new CustomerBO();
		bo.setCustname(dto.getCustName());
		bo.setCustaddrs(dto.getCustAddrs());
		bo.setPamt(dto.getpAmt());
		bo.setRate(dto.getRate());
		bo.setIntramt(interest);
		int count=dao.insert(bo);
		if(count==0)
			return "Customer data insertion is failed";
		else
			return "Customer data insertion is successful";
	}

}
