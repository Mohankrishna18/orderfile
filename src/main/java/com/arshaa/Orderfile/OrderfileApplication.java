package com.arshaa.Orderfile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class OrderfileApplication {
	
	
	@Autowired
	private OrderDao orderdao;
	@GetMapping
	public List<Order> fetchOrder(){
	  return orderdao.getOrders();
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderfileApplication.class, args);
	}

}
