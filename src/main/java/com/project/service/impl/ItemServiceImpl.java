package com.project.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ItemDao;
import com.project.model.Item;
import com.project.service.ItemService;
@Transactional
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	ItemDao dao;
	public void setDao(ItemDao dao) {
		this.dao = dao;
	}
	@Override
	public List<Item> getAllItem() {
		return dao.getAllItem();
	}


}
