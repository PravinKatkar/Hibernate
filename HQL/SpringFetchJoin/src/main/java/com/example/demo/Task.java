package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int task_Id;

	@Column
	private String description;
	
	@Column
	private String supervisor;

	public Task() { 		
		super();
	}

	public Task(String description, String supervisor) {
		super();
		this.description = description;
		this.supervisor = supervisor;
	}

	public int getTask_Id() {
		return task_Id;
	}

	public void setTask_Id(int task_Id) {
		this.task_Id = task_Id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	@Override
	public String toString() {
		return "Task [task_Id=" + task_Id + ", description=" + description + ", supervisor=" + supervisor + "]";
	}
	
	
}
