package com.project.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.ItemDao;
import com.project.model.Item;
@Repository
public class ItemDaoImpl implements ItemDao {
	SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	@Override
	public List<Item> getAllItem() {
		Session session = factory.getCurrentSession();
		String hql = "FROM Item";
		@SuppressWarnings("unchecked")
		List<Item> itemList = session.createQuery(hql).getResultList();
		return itemList;
	}

}
