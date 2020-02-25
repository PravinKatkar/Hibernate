package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;

@Entity(name="JAuthor")
public class JAuthor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable=false, nullable = false )
	protected long id;
	
	@Version
	@Column(name="version")
	protected int vrsion;
	
	@Column(name="firstName")
	protected String firstName;
	
	@Column(name="lastName")
	protected String lastName;

	@ManyToMany(mappedBy="authors")
	private List<JPublication> publications = new ArrayList<JPublication>();
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVrsion() {
		return vrsion;
	}

	public void setVrsion(int vrsion) {
		this.vrsion = vrsion;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
	
	public List<JPublication> getPublications() {
		return publications;
	}

	public void setPublications(List<JPublication> publications) {
		this.publications = publications;
	}

	@Override
	public String toString() {
		return "JAuthor [id=" + id + ", vrsion=" + vrsion + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	

}
