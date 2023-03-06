package com.xworkz.factory.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.factory.dto.FactoryDTO;



public  interface FactoryService
{
	Set<ConstraintViolation<FactoryDTO>> validateAndSave(FactoryDTO dto);
	Set<ConstraintViolation<FactoryDTO>> validateAndUpdate(FactoryDTO dto);
	
	default FactoryDTO deleteById(int id)
	{
		return null;
	}
	
	default FactoryDTO findById(int id)
	{
		System.out.println("Running find by.......");
		return null;
	}
	
	default List<FactoryDTO> findByFacName(String factoryName){
		return Collections.emptyList();
	}

		
	
	}



