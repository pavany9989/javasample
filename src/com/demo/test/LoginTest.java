package com.demo.test;

import static org.junit.Assert.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Test;
import org.junit.runner.Request;

import com.demo.LoginServlet;

public class LoginTest {
	//LoginServlet loginServlet;
	@Before
	public void setUp(){
		HttpServletRequest request;
		HttpServletResponse response;
		HttpSession session;
		
	}
	@Test
	public void loginTest() throws Exception{
		when(request.)
		String loginName="pavan";
		assertEquals("pavan",request.getParameter("userName"));
	}

}
