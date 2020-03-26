package com.project.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.CustomerDao;
import com.project.model.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Customer queryCustomerById(Integer id) {
		Session session = factory.getCurrentSession();
		Customer cus = session.get(Customer.class, id);
		return cus;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customer = new ArrayList<>();
		Session session = factory.getCurrentSession();
		String hql = "FROM Customer";
		customer = session.createQuery(hql).getResultList();
		return customer;
	}

}
