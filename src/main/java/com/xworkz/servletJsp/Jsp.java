package com.xworkz.servletJsp;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1,urlPatterns = "/a1")
public class Jsp extends HttpServlet
{
	
   public void Jsp()
   {
	   System.out.println("jsp is running.....");
   }
   
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
	   System.out.println("dopost running......");
	   String fname=req.getParameter("firstname");
	   String lname=req.getParameter("lastname");
	   String gender=req.getParameter("gender");
	   String reason=req.getParameter("reason");
	   String address=req.getParameter("address");
	   
	   System.out.println(fname);
	   System.out.println(lname);
	   System.out.println(gender);
	   System.out.println(reason);
	   System.out.println(address);
	   
	   RequestDispatcher dis=req.getRequestDispatcher("display.jsp");
	   req.setAttribute("fname", fname);
	   req.setAttribute("lname", lname);
	   req.setAttribute("gender", gender);
	   req.setAttribute("reason", reason);
	   req.setAttribute("address",address);
	   dis.forward(req, resp);
	   
	
	}
}
