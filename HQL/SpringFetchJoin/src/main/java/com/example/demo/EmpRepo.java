package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long>{

	//@Query("SELECT DISTINCT e FROM Employee e INNER JOIN e.tasks t")
	@Query("FROM Employee")
	public List<Employee> getEmpList();

	@Query("SELECT DISTINCT e From Employee e INNER JOIN e.taskList t")
	public List<Employee> getInnerJoinEmpList();

	@Query("SELECT DISTINCT e From Employee e INNER JOIN FETCH e.taskList t")
	public List<Employee> getInnerJoinFetchEmpList();

	
	@Query("SELECT DISTINCT e From Employee e LEFT JOIN FETCH e.taskList t")
	public List<Employee> getLeftJoinFetchEmpList();

}
