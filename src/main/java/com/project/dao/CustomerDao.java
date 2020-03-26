package com.project.dao;

import java.util.List;

import com.project.model.Customer;

public interface CustomerDao {
	Customer queryCustomerById(Integer id);
	List<Customer> getAllCustomer();
}
