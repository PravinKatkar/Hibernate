package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	@Autowired 
	private EmpRepo emprepo;
	
	@Autowired 
	private TaskRepo taskrepo;
	
	public void saveEmp() {
		
	      Task task1 = new Task("Coding", "Denise");
	      Task task2 = new Task("Refactoring", "Rose");
	      Task task3 = new Task("Designing", "Denise");
	      Task task4 = new Task("Documentation", "Mike");

	      Employee employee1 = Employee.create("Diana", task1, task3);
	      Employee employee2 = Employee.create("Mike", task2, task4);
	      Employee employee3 = Employee.create("Tim", task3, task4);
	      Employee employee4 = Employee.create("Jack");
	      
	      //emprepo.save(employee1);
	      emprepo.save(employee2);
	      emprepo.save(employee3);
	      emprepo.save(employee4);
	      
	}
	
	public List<Employee> executeQuery() {
		System.out.println("getEmpList ################################################################");
		
		List<Employee> empList = emprepo.getEmpList();
		
		for (Employee employee : empList) {
	          System.out.println(employee.getName() + " - " + employee.getTaskList());
	      }
		
		System.out.println("getInnerJoinEmpList ################################################################");
		
		List<Employee> empList1 = emprepo.getInnerJoinEmpList();
	
		for (Employee employee : empList1) {
	          System.out.println(employee.getName() + " - " + employee.getTaskList());
	    }
		
		System.out.println("getInnerJoinFetchEmpList ################################################################");
		
		List<Employee> empList2 = emprepo.getInnerJoinFetchEmpList();
		
		for (Employee employee : empList2) {
	          System.out.println(employee.getName() + " - " + employee.getTaskList());
	    }
		
		System.out.println("getLeftJoinFetchEmpList ################################################################");
		
		List<Employee> empList3 = emprepo.getLeftJoinFetchEmpList();
		
		for (Employee employee : empList3) {
	          System.out.println(employee.getName() + " - " + employee.getTaskList());
	    }
		
		return empList;
	}
}
