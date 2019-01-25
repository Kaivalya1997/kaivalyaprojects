package com.sapient.order.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.order.service.IOrderService;
import com.sapient.order.service.Order;
import com.sapient.order.service.OrderServiceImpl;

@WebServlet("/hello") // URL pattern
public class OrderServlet extends HttpServlet {
    
	IOrderService orderservice = new OrderServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		 System.out.println("post call"); ServletInputStream stream =
//		req.getInputStream(); Reader reader = new BufferedReader(new
//		InputStreamReader(stream)); System.out.println(reader.read(new char[50]));
		 
		String ID=req.getParameter("id");
		String price=req.getParameter("price");
		//String[] selectedsubjects=req.getParameterValues("subjects"); 
		Order orderBO= new Order();
		int res=Integer.parseInt(price);
		orderBO.setPrice(res);
		orderBO.setID(ID);
		orderservice.processOrder(orderBO);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
//		System.out.println("In Page "+ req.getHeader("company"));
//		System.out.println("headquarters is  "+ req.getHeader("headquarters"));
	//	System.out.println("query string= " + req.getQueryString());
		System.out.println("query = " + req.getParameter("item"));
		System.out.println("abcd="+req.getHeader("location"));
//		PrintWriter writer = resp.getWriter();
//		writer.append("hello world");
		// String companyRequestHeaderValue = req.getHeader("company");
		//System.out.println(companyRequestHeaderValue));
		// resp.setHeader("location", "http://yahoo.com");
		Enumeration<String> headers = req.getHeaderNames();
		while (headers.hasMoreElements()) {
			String headerName = headers.nextElement();
			System.out.println(req.getHeader(headerName));
		}
		// resp.setStatus(301);
	}
}
