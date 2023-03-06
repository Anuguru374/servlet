package com.xworkz.factory.controller;

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

import com.xworkz.factory.dto.FactoryDTO;
import com.xworkz.factory.service.FactoryService;

@Controller
@RequestMapping("/")
public class FactoryController {

	@Autowired
	private FactoryService service;

	private List<String> factoryPlace = Arrays.asList("Balglore", "Ballari", "Mysore", "Hydrabad");

	public FactoryController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/cool")
	public String onFactory(Model model) {
		System.out.println("Running the on...");
		model.addAttribute("place", factoryPlace);
		return "Factory";
	}

	@PostMapping("/cool")
	public String onFactory(FactoryDTO dto, Model model) {
		System.out.println("Running the post method...");
		Set<ConstraintViolation<FactoryDTO>> violations = service.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("No violations");
			model.addAttribute("factorydto", dto);
			return "FactorySuccess";
		}

		model.addAttribute("place", factoryPlace);
		model.addAttribute("dto", dto);
		model.addAttribute("error", violations);
		System.out.println("violaion in factory");
		return "Factory";
	}

	@GetMapping("/Search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running the onSearch..." + id);
		FactoryDTO dto = this.service.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "Search";
	}

	@GetMapping("/SearchByFacName")
	public String onSearchByFacName(@RequestParam String factoryName, Model model) {
		System.out.println("running onSearchByFacName" + factoryName);
		List<FactoryDTO> list = this.service.findByFacName(factoryName);
		if (list != null) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "not fount");
		}
		return "SearchByFacName";
	}

	@GetMapping("/update")
	public String onUpdate(@RequestParam int id, Model model) {
		System.out.println("running onUpdate..");
		FactoryDTO dto = this.service.findById(id);
		model.addAttribute("dto", dto);
      	model.addAttribute("factoryPlace", factoryPlace);
		return "UpdateFactory";
	}

	@PostMapping("/update")
	public String onUpdate(FactoryDTO dto, Model model) {
		System.out.println("running onUpdate......");

		Set<ConstraintViolation<FactoryDTO>> constraintViolation = this.service.validateAndSave(dto);

		if (constraintViolation.size() > 0) {
			model.addAttribute("errors", constraintViolation);
		} else {
			model.addAttribute("message", "Factory update success");
		}
		return "UpdateFactory";
	}

	@GetMapping("/delete")
	public String onDelete(@RequestParam int id, Model model) {
		System.out.println("running..." +id);
		FactoryDTO dto = this.service.deleteById(id);
		if (dto == null) {

			model.addAttribute("id", id);

			model.addAttribute("message", "delete the data successfully");
		} else {
			model.addAttribute("error", "id not found");
		}
		return "delete";
	}

}