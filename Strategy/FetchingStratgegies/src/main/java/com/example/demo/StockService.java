package com.example.demo;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService {

	@Autowired
	StockRepo stockRepo;
	
	@Autowired
	StockDRRepo sdrRepo;
	
	public void saveStock() {
		Stock stock1 = new Stock();
		stock1.setName("HSBC");
		stock1.setStockCode("H1234");
		stock1.setStockName("H12");
		stock1 = stockRepo.save(stock1);	

		System.out.println("Saved Stock1" + stock1);
		
		
		StockDailyRecord sdr1 = new StockDailyRecord(new Float(12.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr1);

		
		StockDailyRecord sdr2 = new StockDailyRecord(new Float(13.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr2);
		
		
		
		StockDailyRecord sdr3 = new StockDailyRecord(new Float(15.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr3);
		
		StockDailyRecord sdr4 = new StockDailyRecord(new Float(12.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr4);

		
		StockDailyRecord sdr5 = new StockDailyRecord(new Float(13.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr5);
		
		
		
		StockDailyRecord sdr6 = new StockDailyRecord(new Float(15.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr6);
		
		StockDailyRecord sdr11 = new StockDailyRecord(new Float(12.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr11);

		
		StockDailyRecord sdr12 = new StockDailyRecord(new Float(13.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr12);
		
		
		StockDailyRecord sdr13 = new StockDailyRecord(new Float(15.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr13);
		
		StockDailyRecord sdr14 = new StockDailyRecord(new Float(12.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr14);

		
		StockDailyRecord sdr15 = new StockDailyRecord(new Float(13.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr15);
		
		
		
		StockDailyRecord sdr16 = new StockDailyRecord(new Float(15.98),new Date(),stock1.getStock_id());
		sdr1 = sdrRepo.save(sdr16);
		
		//sdr1.setPrice(new Float(109.79));
		//sdr1.setDate(new Date());
		//sdr1 = sdrRepo.save(sdr1);
		//sdr1.setStock_id(stock1.getStock_id());
		//sdr1 = sdrRepo.save(sdr1);
	}
	
	public void showStocks() {
		List<Stock> stocks = stockRepo.findAll();
		System.out.println(" Received Stocks  = " + stocks.size());
		
		for(Stock s: stocks) {
			
			Set<StockDailyRecord> sdrs = s.getSdr();
			System.out.println(" Received StockDailyRecord  = " + sdrs.size());
			
			for(StockDailyRecord sdr: sdrs) {
				System.out.println(" Received Price  = " +sdr.getPrice());
			}
				
		}
	}

}
