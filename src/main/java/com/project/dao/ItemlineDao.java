package com.project.dao;

import java.util.List;

import com.project.model.Itemline;

public interface ItemlineDao {
	List<Itemline> getOrderDetailByOrder(int oid);
}
