package com.project.service;

import com.project.model.Orders;

public interface OrderService {
	Orders getOrderByCus(int oid);
	Integer addOrder(Orders order);
}
