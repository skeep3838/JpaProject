package com.project.service;

import java.util.List;

import com.project.model.Itemline;

public interface ItemlineService {
	List<Itemline> getOrderDetailByOrder(int oid);
	void addOrderDetail(Itemline orderList);
}
