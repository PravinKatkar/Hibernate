package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Inheritance( strategy = InheritanceType.JOINED)
public class JPublication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable=false, nullable = false )
	protected long id;
	
	@Column
	protected String title;
	
	@Version
	@Column(name="version")
	protected int vrsion;
	
	@ManyToMany (cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinTable(name="JPublicationAther" , joinColumns = { @JoinColumn(name="publicationId", referencedColumnName = "id") } ,  
										 inverseJoinColumns = { @JoinColumn(name="authorId", referencedColumnName = "id")} )
	private List<JAuthor> authors = new ArrayList<JAuthor>();
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date publishingDate;

	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getVrsion() {
		return vrsion;
	}

	public void setVrsion(int vrsion) {
		this.vrsion = vrsion;
	}	

	public List<JAuthor> getAuthors() {
		return authors;
	}

	public void setAuthors(List<JAuthor> authors) {
		this.authors = authors;
	}

	public Date getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(Date publishingDate) {
		this.publishingDate = publishingDate;
	}

	@Override
	public String toString() {
		return "JPublication [id=" + id + ", title=" + title + ", vrsion=" + vrsion + ", authors=" + authors
				+ ", publishingDate=" + publishingDate + "]";
	}

	public JPublication(String title, int vrsion, Date publishingDate) {
		super();
		this.title = title;
		this.vrsion = vrsion;
		this.publishingDate = publishingDate;
	}
	public JPublication() {
		super();
	}
}
