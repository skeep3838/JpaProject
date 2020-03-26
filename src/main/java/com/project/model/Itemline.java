package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemline")
public class Itemline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer seq;
	private Integer iid;
	private Integer qty;
	
	@ManyToOne
	@JoinColumn(name="oid", nullable=false)
	private Orders orders;
	
	public Itemline(Integer seq, Integer iid, Integer qty, Orders orders) {
		super();
		this.seq = seq;
		this.iid = iid;
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
	
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
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
