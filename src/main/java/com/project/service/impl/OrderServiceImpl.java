package com.project.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.OrderDao;
import com.project.model.Orders;
import com.project.service.OrderService;
@Transactional
@Service
public class OrderServiceImpl implements OrderService {
	OrderDao dao;
	@Autowired
	public void setDao(OrderDao dao) {
		this.dao = dao;
	}
	@Override
	public Orders getOrderByCus(int oid) {
		return dao.getOrderByCus(oid);
	}
	@Override
	public Integer addOrder(Orders order) {
		return dao.addOrder(order);
	}

}
