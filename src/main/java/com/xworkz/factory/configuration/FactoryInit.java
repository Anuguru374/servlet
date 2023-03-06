package com.xworkz.factory.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class FactoryInit  extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] ref1 ={FactoryConfiguration.class};
		return ref1;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		return new String[] {"/"};
		//return str;
	}
	
	public void confiDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running confiDefaultServletHandling");
		configurer.enable();
		
	}
	
	
	

}