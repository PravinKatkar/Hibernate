package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "bd_type" )
public class BillingDetails implements Serializable {
	 
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	protected long id;

	public BillingDetails(long id, String owner, String number) {
		super();
		this.id = id;
		this.owner = owner;
		this.number = number;
	}

	public BillingDetails(String owner, String number) {
		super();
		this.owner = owner;
		this.number = number;
	}
	
	public BillingDetails() {
		super();
	}

	@Column 
	protected String owner;
	
	@Column
	protected String number;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BillingDetails [id=" + id + ", owner=" + owner + ", number=" + number + "]";
	}
	
}
