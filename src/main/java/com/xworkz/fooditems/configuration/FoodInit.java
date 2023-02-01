package com.xworkz.fooditems.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FoodInit  extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running get root configuration");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		Class[] cl= {FoodConfigiration.class};
		System.out.println("Running get servlet configclass");
		return cl;
	}

	@Override
	protected String[] getServletMappings() 
	{
		System.out.println("Running get servlet mapping");
		return new String[] {"/"};
	}
	
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer congigurer)
	{
		System.out.println("running");
	
	}
		

}
