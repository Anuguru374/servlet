package com.xworkz.factory.repository;

import java.util.Collections;
import java.util.List;
import com.xworkz.factory.entity.FactoryEntity;

public interface FactoryRepository
{
	 boolean save(FactoryEntity factoryEntity);
	 boolean update(FactoryEntity factoryEntity);
	
	 
	 
	 default FactoryEntity deleteById(int id)
	 {
		 return null;
	 }
	 
	default FactoryEntity find(int id)
	{
		System.out.println("Running find by");
		return null;
	}
	
	default List<FactoryEntity> findByFacName(String factoryName){
		return Collections.emptyList();
	}

}



