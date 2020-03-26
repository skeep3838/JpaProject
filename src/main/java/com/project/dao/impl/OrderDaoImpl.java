package com.project.dao.impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.OrderDao;
import com.project.model.Orders;
@Repository
public class OrderDaoImpl implements OrderDao {
	SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public Orders getOrderByCus(int oid) {
		Session session = factory.getCurrentSession();
		String hql = "FROM Orders o where o.oid=:id";
		Orders orderLidt = (Orders) session.createQuery(hql).setParameter("id", oid).getSingleResult();
		return orderLidt;
	}

	@Override
	public Integer addOrder(Orders order) {
		Session session = factory.getCurrentSession();
		session.save(order);
		String hql="SELECT MAX(oid)FROM Orders ";
		Integer oid = (Integer) session.createQuery(hql).getSingleResult();
		return oid;
	}

}
