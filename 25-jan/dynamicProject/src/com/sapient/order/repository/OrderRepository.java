package com.sapient.order.repository;

import com.sapient.order.service.Order;
import java.sql.*;

public class OrderRepository {

	

	public void save(Order order) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/orders","root","root");
		      stmt = conn.createStatement();
		      stmt.execute("INSERT INTO orders.table2 VALUES ('"+order.getID()+"',"+order.getPrice()+")");
		      
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
