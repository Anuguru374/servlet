package com.xworkz.aeroplane.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.Repository.AeroplaneRepository;
import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;




@Service
public class AeroplaneServiceImp implements AeroplaneService{

	@Autowired
	private AeroplaneRepository repository;
	
	public AeroplaneServiceImp() 
	{
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} 
		else 
		{
			System.out.println("Violations is not there in dto,can save");
			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			boolean saved = this.repository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}

	@Override
	public AeroplaneDTO findById(int id) {
		if (id > 0) {
			AeroplaneEntity entity = this.repository.findById(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				dto.setId(entity.getId());
				return dto;
			}
		}
		return AeroplaneService.super.findById(id);
	}
}