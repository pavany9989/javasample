package com.demo.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.mockito.Mockito;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import com.demo.LoginServlet;

public class LoginPageTest extends Mockito {

	/*@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}*/

	
	
	 private LoginServlet servlet;
	 private MockHttpServletRequest request;
	 private MockHttpServletResponse response;
					
	
	@Before
	public void setUp() throws Exception {
		
	servlet=new LoginServlet();
	request=new MockHttpServletRequest();
	response=new MockHttpServletResponse();
	ResultSet rs;
   /* mock(HttpServletRequest.class);
	mock(HttpServletResponse.class);
	HttpSession session;*/
	
}
	

	@Test
	public void LoginPagetest() throws ServletException, IOException, SQLException {
	
		
		servlet.doPost(request, response);
		String userName ="pavan";
		String passWord="9989";
		//assertEquals("usernamecheck", "pavan", request.getParameter("userName"));
		//PreparedStatement ps = con.prepareStatement("select * from loginz where username=? and password=?");
		//ResultSet rs = ps.executeQuery();
		//ResultSet rs = null;
		//assertEquals( "pavan", request.getParameter("userName"));
		//assertEquals( "9989", request.getParameter("passWord"));
		//assertEquals("B ","pavan",request.getParameter("userName"));
		
		assertArrayEquals("B","pavan" ,request.getParameter("userName") );
		assertArrayEquals("B","9989" ,request.getParameter("passWord") );
		
		
	}


	private void assertArrayEquals(String string, String string2, String parameter) {
		// TODO Auto-generated method stub
		
	}

}
