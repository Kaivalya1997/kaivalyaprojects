package com.sapient.order.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/hello") // URL pattern
public class OrderServlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("In Page "+ req.getHeader("company"));
//		System.out.println("headquarters is  "+ req.getHeader("headquarters"));
//		System.out.println("query string= " + req.getQueryString());
//		System.out.println("query = " + req.getParameter("item"));
//		
		}
		
	}

