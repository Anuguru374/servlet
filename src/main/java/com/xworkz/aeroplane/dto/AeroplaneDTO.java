package com.xworkz.aeroplane.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AeroplaneDTO 
{

	private int id;
	@NotBlank(message = "Company cannot be null")
	@Size(min = 5, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String company;
	@NotBlank(message = "Name cannot be null")
	@Size(min = 4, max = 14, message = "Name should be more than 4 or less than 14 characters")
	private String name;
	@NotNull(message = "Cost cannot be null or blank")
	@Min(value = 1, message = "Cost cannot be less than zero")
	private Double cost;
	@NotBlank(message = "Type should be selected")
	private String type;
	@NotBlank(message = "Country should be selected")
	private String country;
}