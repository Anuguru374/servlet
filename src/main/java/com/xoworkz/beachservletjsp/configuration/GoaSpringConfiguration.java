package com.xoworkz.beachservletjsp.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("package com.xoworkz.beachservletjsp")
public class GoaSpringConfiguration
{
	public GoaSpringConfiguration()
	{
		System.out.println("created"+this.getClass().getSimpleName());
	}

}
