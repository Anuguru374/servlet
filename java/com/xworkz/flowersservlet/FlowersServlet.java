package com.xworkz.flowersservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/A1")
public class FlowersServlet extends HttpServlet
{
    public void FlowersServlet()
    {
    	System.out.println("Rose");
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    	System.out.println("Rose is a flower");
    	String data=" do get ";
    	PrintWriter writer=resp.getWriter();
    	System.out.print(writer);
    	resp.setContentType("textappl/plain");
    }
    
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	System.out.println("Lotus");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	System.out.println("Sunflower");
    }
    
      
    @Override
    protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException 
    {
    	
       System.out.println("Cosmos");
    }
    
    
    @Override
    protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
    {
      System.out.println("Plumeria");
    }
    
    
    @Override
    protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException
    {
    	System.out.println("Cherry blossom");
    }
    
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
    	System.out.println("Hollyhocks");
    }
    
}
