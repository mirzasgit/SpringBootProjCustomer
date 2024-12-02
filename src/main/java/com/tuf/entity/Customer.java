package com.tuf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Table(name="customer_info")
@Data
@AllArgsConstructor
public class Customer {

	@Id
	@Column(name="custId")
	private Integer custId;
	
	@Column(name="custPwd")
	private String custPwd;
	
	@Column(name="custName")
	private String custName;
	
	@Column(name="custPhno")
	private Long custPhno;
	
	@Column(name="custAddr")
	private String custAddr;
	
	public Customer() {
		System.out.println("Customer:: 0-arg Constructure");
	}
}
