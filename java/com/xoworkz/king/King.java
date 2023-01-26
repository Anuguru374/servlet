package com.xoworkz.king;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/king")
public class King extends HttpServlet
{
    public void King()
    {
    	System.out.println("King......");
    }
    
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	System.out.println("king......");
        String name=req.getParameter("name");
        String region=req.getParameter("region");
        String noOfQueens=req.getParameter("noOfQueens");
        String DOB=req.getParameter("DOB");
        String DOD=req.getParameter("DOD");
        
        
        System.out.println(name);
        System.out.println(region);
        System.out.println(noOfQueens);
        System.out.println(DOB);
        System.out.println(DOD);
        
        PrintWriter writer=resp.getWriter();
        writer.print("king name" + name + " is send successfully.......");
        resp.setContentType("text/plain");
        
    }
}

