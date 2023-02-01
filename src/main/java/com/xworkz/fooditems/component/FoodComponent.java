package com.xworkz.fooditems.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/send")
public class FoodComponent
{
	public FoodComponent()
	{
		System.out.println("create" +this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String taste(@RequestParam String name,@RequestParam String type,@RequestParam int quantity,@RequestParam double price)
   {
	System.out.println("Running taste..");
	System.out.println(name);
	System.out.println(type);
	System.out.println(quantity);
	System.out.println(price);
	return "Food.jsp";
   }

}
