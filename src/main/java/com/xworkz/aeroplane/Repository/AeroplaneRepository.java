package com.xworkz.aeroplane.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;

public interface AeroplaneRepository
{
	 boolean save(AeroplaneEntity entity);
	
	default AeroplaneEntity findById(int id)
	{
		System.out.println("Running find by");
		return null;
	}

}
