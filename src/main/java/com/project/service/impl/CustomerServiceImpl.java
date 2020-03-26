package com.project.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.CustomerDao;
import com.project.model.Customer;
import com.project.service.CustomerService;

@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	CustomerDao dao;
	@Autowired
	public void setDao(CustomerDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Customer queryCustomerById(Integer id) {
		return dao.queryCustomerById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return dao.getAllCustomer();
	}

}
