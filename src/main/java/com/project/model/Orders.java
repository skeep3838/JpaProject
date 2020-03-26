package com.project.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;


@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int oid;
	private Date createDate;
	private int shipment;
	@ManyToOne
	@JoinColumn(name="cid", nullable=false)
	private Customer customer;
	
	@OneToMany(mappedBy="orders", cascade= {CascadeType.ALL}, orphanRemoval = false, fetch =FetchType.EAGER)
	@OrderBy("seq")
	List<Itemline> orderDetail;
	
	public Orders(int oid, int cid, Date createDate, int shipment, Customer customer) {
		this.oid = oid;
		this.createDate = createDate;
		this.shipment = shipment;
		this.customer = customer;
	}
	public Orders(int oid, int cid, Date createDate, int shipment, Customer customer, List<Itemline> orderDetail) {
		this.oid = oid;
		this.createDate = createDate;
		this.shipment = shipment;
		this.customer = customer;
		this.orderDetail = orderDetail;
	}
	
	public Orders() {}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getShipment() {
		return shipment;
	}

	public void setShipment(int shipment) {
		this.shipment = shipment;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setOrderDetail(List<Itemline> orderDetail) {
		this.orderDetail = orderDetail;
	}
	public List<Itemline> getOrderDetail() {
		return orderDetail;
	}

	
}
