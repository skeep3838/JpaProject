package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.project.model.Item;

@Transactional
@Service
public interface ItemService {
	List<Item> getAllItem();
}
