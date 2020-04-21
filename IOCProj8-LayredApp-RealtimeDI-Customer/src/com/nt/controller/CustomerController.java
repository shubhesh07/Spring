package com.nt.controller;
import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;
import com.nt.vo.CustomerVO;

public class CustomerController {
	private CustomerService service;
		public CustomerController(CustomerService service) {
			this.service=service;
		}
	public String process(CustomerVO vo)throws Exception {
		CustomerDTO dto=null;
		String result=null;
		//Convert VO class obj to DTO class obj
		dto=new CustomerDTO();
		dto.setCustNo(Integer.parseInt(vo.getCustNo()));
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setpAmt(Float.parseFloat(vo.getpAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		//use Service
				result=service.CustomerRegister(dto);
				return result;
	}
	
}//class
