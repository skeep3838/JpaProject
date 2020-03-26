package com.project.service;

import java.util.List;

import com.project.model.Customer;

public interface CustomerService {
	Customer queryCustomerById(Integer id);
	List<Customer> getAllCustomer();
}
