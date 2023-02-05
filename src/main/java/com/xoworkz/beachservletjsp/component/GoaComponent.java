package com.xoworkz.beachservletjsp.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xoworkz.beachservletjsp.dto.BeachDTO;

@Component
@RequestMapping("/beach")
public class GoaComponent
{
	public GoaComponent()
	{
		System.out.println("created" +this.getClass().getSimpleName());
	}
    
	@PostMapping
	public String onBeach(BeachDTO dto,Model model)
	{
		model.addAttribute("name",dto.getName());
		model.addAttribute("location",dto.getSelect());
		model.addAttribute("games",dto.getGames());
		
		System.out.println("beach is running");
		System.out.println("dto" +dto);
		return "BeachSuccessFull.jsp";
		
	}
}
