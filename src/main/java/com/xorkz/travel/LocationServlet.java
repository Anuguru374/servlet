package com.xorkz.travel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2,urlPatterns = "/a2")
public class LocationServlet extends HttpServlet 
{
	public LocationServlet()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		System.out.println(" do get method is called in the location class");
		 String name=req.getParameter("name");
		 String email=req.getParameter("email");
		 String startPoint=req.getParameter("startPonit");
		 String destinationPonit=req.getParameter("destinationPonit");
		 String gender=req.getParameter("gender");
		 
		// String destinationPonit=req.getParameter("destinationPonit");
		 System.out.println(name);
		 System.out.println(email);
		 System.out.println(startPoint);
		 System.out.println(destinationPonit);
		 System.out.println(gender);
		 
		PrintWriter writer=resp.getWriter();
		if(name.length()>3) 
		{
		    writer.print("valid");
		    writer.print("successfully registered");
		    resp.setContentType("text/plain");
		}
		else 
		{
			writer.println(" invalid");
		}
	}

}