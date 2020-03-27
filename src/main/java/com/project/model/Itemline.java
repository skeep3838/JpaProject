package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemline")
public class Itemline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer seq;
	private Integer qty;
	@OneToOne
	@JoinColumn(name="iid", nullable=false)
	private Item item;
	@ManyToOne
	@JoinColumn(name="oid", nullable=false)
	private Orders orders;
	
	public Itemline(Integer seq, Item item, Integer qty, Orders orders) {
		super();
		this.seq = seq;
		this.item = item;
		this.qty = qty;
		this.orders = orders;
	}
	
	public Itemline() {}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
		
	public Item getItem() {
		return item;
	}

//	public void setItem(Item item) {
//		this.item = item;
//	}

	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	public Orders getOrder() {
		return orders;
	}
	
	
	
}