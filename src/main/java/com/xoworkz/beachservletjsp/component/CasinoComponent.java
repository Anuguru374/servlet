package com.xoworkz.beachservletjsp.component;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xoworkz.beachservletjsp.dto.Casino;

@Component
@RequestMapping("/casino")
public class CasinoComponent 
{
	public CasinoComponent()
	{
		System.out.println("creayed" +this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasio(Casino dto,Model model)
	{
		System.out.println("rinning oncasino" +dto);
		model.addAttribute("name",dto.getName());
		model.addAttribute("cruise",dto.getCruise());
		model.addAttribute("entryFee",dto.getEntryFees());
		model.addAttribute("alcohal",dto.getAlcohal());
		model.addAttribute("alcohal",dto.getFree());
		System.out.println("dto" +dto);
		return "CasinoSucessfulljsp.jsp";
		
	}

}
