package com.project.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.ItemlineDao;
import com.project.model.Itemline;
@Repository
public class ItemlineDaoImpl implements ItemlineDao {
	SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Itemline> getOrderDetailByOrder(int oid) {
		Session session = factory.getCurrentSession();
		String hql = "FROM Itemline il where il.oid=:id";
		List<Itemline> itemList = session.createQuery(hql).setParameter("id", oid).getResultList();
		return itemList;
	}
	
	

}
