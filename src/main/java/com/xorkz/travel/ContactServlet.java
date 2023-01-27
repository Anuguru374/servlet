package com.xorkz.travel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/a1")
public class ContactServlet extends HttpServlet
{
	public void ContactServlet()
	{
		System.out.println("created" +this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println(" do get method is calle in the Contact class");
	 String name=req.getParameter("name");
	 String email=req.getParameter("email");
	 String mobile=req.getParameter("mobile");
	 String comments=req.getParameter("comments ");
	 
	 System.out.println(name);
	 System.out.println(email);
	 System.out.println(mobile);
	 System.out.println(comments);
	 
	  PrintWriter writer=resp.getWriter();
		if(name.length()>3) 
		{
			writer.println("valid");
		    writer.print("successfully register");
		    resp.setContentType("text/plain");
		}
		else 
		{
			writer.println(" invalid name");
		}
		
		
	}

}

