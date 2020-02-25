package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDRRepo extends JpaRepository<StockDailyRecord, Long> {

}
