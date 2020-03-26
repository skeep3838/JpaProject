package com.project.service;

import com.project.model.Orders;

public interface OrderService {
	Orders getOrderByCus(int oid);
	void addOrder(Orders order);
}
