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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seq;
	private int iid;
	private int qty;
	
	@ManyToOne
	@JoinColumn(name="oid", nullable=false)
	private Orders orders;
	
	public Itemline(int seq, int iid, int qty, Orders orders) {
		this.seq = seq;
		this.iid = iid;
		this.qty = qty;
		this.orders = orders;
	}
	
	public Itemline(int seq, int iid, int qty) {
		this.seq = seq;
		this.iid = iid;
		this.qty = qty;
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
