package com.project.dao;

import com.project.model.Orders;

public interface OrderDao {
	Orders getOrderByCus(int oid);
}
