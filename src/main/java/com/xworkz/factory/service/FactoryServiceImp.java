package com.xworkz.factory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.factory.dto.FactoryDTO;
import com.xworkz.factory.entity.FactoryEntity;
import com.xworkz.factory.repository.FactoryRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;




@Service
public class FactoryServiceImp implements FactoryService
{

	@Autowired
	private FactoryRepository repository;
	
	public FactoryServiceImp() 
	{
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	
	@Override
	public Set<ConstraintViolation<FactoryDTO>> validateAndSave(FactoryDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FactoryDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("Violations in dto " + dto);
			return violations;
		} 
		else 
		{
			System.out.println("Violations is not there in dto,can save");
			FactoryEntity entity = new FactoryEntity();
			entity.setFactoryName(dto.getFactoryName());
			entity.setFactoryPlace(dto.getFactoryPlace());
			entity.setEmpName(dto.getEmpName());
			entity.setEmpAddress(dto.getEmpAddress());
			entity.setSalary(dto.getSalary());
			boolean saved = this.repository.save(entity);
			System.out.println("Entity data is saved " + saved);
			return Collections.emptySet();
		}
	}
	

	@Override
	public FactoryDTO findById(int id) {
		if (id > 0) {
			FactoryEntity entity = this.repository.find(id);
			if (entity != null) {
				System.out.println("Entity is found in service for id " + id);
				FactoryDTO dto = new FactoryDTO();
				dto.setFactoryName(entity.getFactoryName());
				dto.setFactoryPlace(entity.getFactoryPlace());
				dto.setEmpName(entity.getEmpName());
				dto.setEmpAddress(entity.getEmpAddress());
				dto.setSalary(entity.getSalary());			
				dto.setId(entity.getId());
				return dto;
			}
		}
		return FactoryService.super.findById(id);
	}
	
	

	public List<FactoryDTO> findByFacName(String factoryName) {
		System.out.println("running findByfacname in service " + factoryName);
		
		if(factoryName != null && !factoryName.isEmpty()) {
			System.out.println("name is valid.. calling repo");
			List<FactoryEntity> entities = this.repository.findByFacName(factoryName);
			
			List<FactoryDTO> listOfDto = new ArrayList<>();
			for(FactoryEntity entity : entities) {
				FactoryDTO dto = new FactoryDTO();
				dto.setFactoryName(entity.getFactoryName());
				dto.setFactoryPlace(entity.getFactoryPlace());
				dto.setId(entity.getId());
				dto.setEmpName(entity.getEmpName());
				dto.setEmpAddress(entity.getEmpAddress());
				dto.setSalary(entity.getSalary());
				listOfDto.add(dto);
				return  listOfDto;
		  }
			System.out.println("size of dtos " + listOfDto.size());
			System.out.println("size of entities " + entities.size());
		
		}
		else {
			System.out.println("name is invalid..");
		}
		return FactoryService.super.findByFacName(factoryName);
		
	}

	

	public Set<ConstraintViolation<FactoryDTO>> validateAndUpdate(FactoryDTO dto) {
		System.out.println("running validateAndUpdate..");
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FactoryDTO>> violation = validator.validate(dto);
		if(violation != null && !violation.isEmpty()) {
			System.out.println("violations are there");
			return violation;
		}
		else {
			System.out.println("There are no violation in dto ");
			FactoryEntity entity = new FactoryEntity();
			entity.setFactoryName(dto.getFactoryName());
			entity.setFactoryPlace(dto.getFactoryPlace());
			entity.setEmpName(dto.getEmpName());
			entity.setEmpAddress(dto.getEmpAddress());
			entity.setSalary(dto.getSalary());
			entity.setId(dto.getId());
			
			boolean updated = this.repository.update(entity);
			System.out.println("data updated " + updated);
			return Collections.emptySet();
		}
	}
	

	@Override
	public FactoryDTO deleteById(int id) {
		System.out.println("Running delete by id in service"+id);
		if(id>0) {
			FactoryEntity factoryEntity = this.repository.deleteById(id);
		}
		return FactoryService.super.deleteById(id);
	}
				
	}


