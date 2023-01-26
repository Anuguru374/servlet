package com.xowrkz.dep;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1,urlPatterns="/dep")
public class Department extends HttpServlet
{
	public void Department()
	{
		System.out.println("Depatment Running.......");
	}
     
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
    	System.out.println("Department......");
        String depName=req.getParameter("depName");
        String depId=req.getParameter("depId");
        String depLocation=req.getParameter("depLocation");
        String noOfDep=req.getParameter("noOfDep");
        String depTime=req.getParameter("depTime");
        
        String depAddress=req.getParameter("depAddress");
        String empName=req.getParameter("empName");
        String empId=req.getParameter("empId");
        String empLocation =req.getParameter("empLocation");
        String empNo=req.getParameter("empNo");
        
        String noOfEmp=req.getParameter("noOfEmp");
        String gender=req.getParameter("gender");
        String phoneNo=req.getParameter("phoneNo");
        String empAddress=req.getParameter("empAddress");
        String empId1=req.getParameter("empId1");
        
        
        String panNo=req.getParameter("panNo");
        String bank=req.getParameter("bank");
        String passPostNo=req.getParameter("passPostNo");
        String empPermanentAddress=req.getParameter("empPermanentAddress");
        String empId2=req.getParameter("empId2");
    
        
        
       System.out.println(depName);
       System.out.println(depId);
       System.out.println(depLocation);
       System.out.println(noOfDep);
       System.out.println(depTime);
       
       System.out.println(depAddress);
       System.out.println(empName);
       System.out.println(empId);
       System.out.println(empLocation);
       System.out.println(empId1);
       
       System.out.println(noOfEmp);
       System.out.println(gender);
       System.out.println(phoneNo);
       System.out.println(empAddress);
       System.out.println(empId1);
       
       System.out.println(panNo);
       System.out.println(bank);
       System.out.println(passPostNo);
       System.out.println(empPermanentAddress);
       System.out.println(empId2);
       
        
        PrintWriter writer=resp.getWriter();
        writer.print("Department name" + depName + " is send successfully.......");
        resp.setContentType("text/plain");
        
    }
}