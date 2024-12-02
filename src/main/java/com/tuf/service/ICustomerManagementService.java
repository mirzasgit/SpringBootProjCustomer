package com.tuf.service;

import com.tuf.entity.Customer;

public interface ICustomerManagementService {

	public String customerRegister(Customer cus);  
	
	public String customerLogin(int cusId, String cusPwd);
		
	public void customerUpdate(int cusId);	 
	
	public Customer customerView(int cusId);
	
	public void customerDelete(int cusId);
	
	
} 
