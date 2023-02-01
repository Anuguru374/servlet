package com.xworkz.fooditems.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.fooditems")
public class FoodConfigiration 
{
	public  FoodConfigiration()
	{
		System.out.println("created" +this.getClass().getSimpleName());
		
	}

}
