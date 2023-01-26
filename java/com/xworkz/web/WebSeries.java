package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/web")
public class WebSeries extends HttpServlet
{
	public void WebSeries()
	{
		System.out.println("Webseries Running.......");
	}
     
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	System.out.println("Webseries......");
        String name=req.getParameter("name");
        String language=req.getParameter("language");
        String episodes=req.getParameter("episodes");
        String ott=req.getParameter(" ott");
        String budget=req.getParameter("budget");
        
        
        System.out.println(name);
        System.out.println(language);
        System.out.println(episodes);
        System.out.println(ott);
        System.out.println(budget);
        
        PrintWriter writer=resp.getWriter();
        writer.print("webseries name" + name + " is send successfully.......");
        resp.setContentType("text/plain");
        
    }
}