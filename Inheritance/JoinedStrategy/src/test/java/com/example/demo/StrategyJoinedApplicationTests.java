package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyJoinedApplicationTests {

	JoinedService js = new JoinedService();
	
	@Test
	void contextLoads() {
	}
	
}