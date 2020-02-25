package com.example.demo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class JOrderItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long orderitemId;
	
	@Column
	private int seqNo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "orderId" , referencedColumnName = "orderId")
	private JOrder order;

	public JOrderItem() {
		super();
	}
	
	public JOrderItem(int seqNo, JProduct p) {
		super();
		this.seqNo = seqNo;
	}
	
	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	
	public JOrder getOrder() {
		return order;
	}

	public void setOrder(JOrder order) {
		this.order = order;
	}

	
	public long getOrderitemId() {
		return orderitemId;
	}

	public void setOrderitemId(long orderitemId) {
		this.orderitemId = orderitemId;
	}

	@Override
	public String toString() {
		return "OrderItem [order_item_id=" + orderitemId + ", seqNo=" + seqNo + ", order=" + order + "]";
	}
	
	
}
