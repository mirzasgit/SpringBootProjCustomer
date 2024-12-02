package com.tuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.tuf.entity.Customer;
import com.tuf.service.ICustomerManagementService;

@SpringBootApplication(scanBasePackages = {"com.tuf"}) 
public class SpringBootProjCustomerApplication {

	public static void main(String[] args) {
		ApplicationContext cxt= SpringApplication.run(SpringBootProjCustomerApplication.class, args);
		
		ICustomerManagementService customerManager=cxt.getBean("custManagement",ICustomerManagementService.class);
		
		
		cxt.getBean("custManagement",ICustomerManagementService.class);
		try {
			Customer c=new Customer();
			c.setCustId(1);
			c.setCustPwd("abc");
			c.setCustName("joey");
			c.setCustPhno(1212129999l);
			c.setCustAddr("hyd");
			
			String customerRegister = customerManager.customerRegister(c);
			
			System.out.println(customerRegister);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	}

}
