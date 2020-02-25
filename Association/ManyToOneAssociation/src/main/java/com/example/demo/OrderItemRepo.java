package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepo extends JpaRepository<JOrderItem , Long>{
	
}
