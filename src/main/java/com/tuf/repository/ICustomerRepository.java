package com.tuf.repository;



import org.springframework.data.repository.CrudRepository;

import com.tuf.entity.Customer;

public interface ICustomerRepository extends CrudRepository<Customer, Integer> {
	
}
