package com.xworkz.aeroplane.Controller;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;



@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;

	private List<String> type = Arrays.asList("Business", "Cargo", "Glider", "Aircraft", "Boeing");
	private List<String> country = Arrays.asList("India", "UK", "US", "CANADA", "DUBHAI");

	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/aeroplane")
	public String onAeroplane(Model model) 
	{
		System.out.println("Running the onAeroplane...");
		List<String> type = Arrays.asList("Business", "Cargo", "Glider", "Aircraft", "Boeing");
	    List<String> country = Arrays.asList("India", "UK", "US", "CANADA", "DUBHAI");
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		return "Aeroplane";
	}
	
	@GetMapping("/search")
	public String onSearch( @RequestParam int id, Model model) {
		System.out.println("Running the onSearch..."+id);
		AeroplaneDTO dto = this.aeroplaneService.findById(id);
		if(dto!=null) 
		{
			model.addAttribute("dto",dto);
		}
		else
		{
		  model.addAttribute("message","data not found");
		}return "AeroplaneSearch";
	}
	@PostMapping("/aeroplane")
	public String onAeroplane(AeroplaneDTO dto, Model model) {
		System.out.println("Running the onAeroplane in post method...");
		Set<ConstraintViolation<AeroplaneDTO>> violations=this.aeroplaneService.validateAndSave(dto);
		if(violations.isEmpty()) {
			System.out.println("No violations , goto succecss page"+dto);
			model.addAttribute("aeroplaneDTO",dto);
			return "Aeroplane";
		}
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		model.addAttribute("error",violations);
		model.addAttribute("dto", dto);
		
		return "Aeroplane";
	}
}