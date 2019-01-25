package com.sapient.order.service;

import java.sql.SQLException;

import com.sapient.order.repository.OrderRepository;

public class OrderServiceImpl implements IOrderService {
   
    @Override
	public void processOrder(Order order){
    	System.out.println("processing order");
    	if(order.getPrice()>50) {
    		System.out.println("order is invalid");
    	}
    	else {
    		OrderRepository repo=new OrderRepository();
    		try {
				repo.save(order);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }
}
