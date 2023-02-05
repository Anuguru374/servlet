package com.xoworkz.beachservletjsp.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses Running");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses Running");
		return new Class[]  {GoaSpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() 
	{
		System.out.println("getServletMappings Running");
		return new String[] {"/"};
	}
	

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer congigurer)
	{
		System.out.println("DefaultServletHandlerConfigurer Running");
		congigurer.enable();
	
	}
		

}
