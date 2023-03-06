package com.xworkz.factory.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FactoryDTO
{
	@Id
	private int id;
	
	@NotBlank(message = "name cannot be null")
	@Size(min = 1, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String factoryName;
	
	@NotBlank(message = "place should be selected")
	private String factoryPlace;
	
	@NotBlank(message = "empname cannot be null")
	@Size(min =1, max = 14, message = "Name should be more than 4 or less than 14 characters")
	private String empName;
	
	@NotBlank(message = "address cannot be null")
	@Size(min =1, max = 30, message = "Name should be more than 5 or less than 30 characters")
	private String empAddress;
	
	@NotNull(message="salary should not be null")
	private Double salary;
	
	
}
