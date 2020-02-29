package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepo extends JpaRepository<CProduct, Long> {

}
