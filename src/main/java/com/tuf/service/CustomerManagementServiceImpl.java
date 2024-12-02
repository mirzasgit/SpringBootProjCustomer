package com.tuf.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuf.entity.Customer;
import com.tuf.repository.ICustomerRepository;

@Service("custManagement")
public class CustomerManagementServiceImpl implements ICustomerManagementService {
	 
	@Autowired
	private ICustomerRepository customerRepo;

	@Override
	public String customerRegister(Customer cus) {
		// TODO Auto-generated method stub
		Customer savedCus = customerRepo.save(cus); 
		return savedCus.getCustId()==null?"Customer Registration Failed":"Customer Registration Successfull";
	}

	@Override
	public String customerLogin(int cusId, String cusPwd) {
		// TODO Auto-generated method stub*+
		Optional<Customer> opCus = customerRepo.findById(cusId);
		if(opCus.isPresent()) {
			if(opCus.get().getCustPwd().equals(cusPwd))
				return "Login Successfull !!";
			else 
				return "Incorrect Password";
		}
		return "Invalid Id";		
	}

	@Override	
	public void customerUpdate(int cusId) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Optional<Customer> opObj = customerRepo.findById(cusId);
		if(opObj.isPresent()) {
			Customer customer = opObj.get();
			System.out.println("Enter new password");
			customer.setCustPwd(sc.nextLine());
			customer.setCustPwd(sc.nextLine());
			customer.setCustAddr(sc.nextLine());
			customer.setCustPhno(sc.nextLong());
			
		}
	}

	@Override
	public Customer customerView(int cusId) {
		// TODO Auto-generated method stub
		Optional<Customer> opObj = customerRepo.findById(cusId);		
		return opObj.get();
	}
 
	@Override
	public void customerDelete(int cusId) {
		
		customerRepo.deleteById(cusId);	
	}

}
