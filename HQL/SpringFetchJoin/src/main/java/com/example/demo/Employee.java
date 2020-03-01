package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table 
public class Employee {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long emp_id;
	
	@Column
	private String name;
	
	@ManyToMany (cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Task> taskList = new ArrayList<Task>();

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public Employee() {
		super();
	}
	
	public Employee(String name, List taskList) {
		this.name = name;
		this.taskList = taskList;
	}
	
	
	public static Employee create(String name, Task task1, Task task2) {	
		List<Task> taskList = new ArrayList();
		taskList.add(task1);
		taskList.add(task2);
		Employee emp = new Employee(name, taskList);
		return emp;
	}

	public static Employee create(String name) {		
		Employee emp = new Employee();
		emp.setName(name);
		return emp;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + "]";
	}
	
	

}
