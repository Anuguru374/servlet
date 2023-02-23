package com.xworkz.aeroplane.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplane.entity.AeroplaneEntity;


@Repository
public class AeroplaneRepositoryImp implements AeroplaneRepository 
{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public AeroplaneRepositoryImp() 
	{
		System.out.println("HotelRepository Implementation Running");
	}


	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("Save Running");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entity);
		transaction.commit();
		entityManager.close();
		return true;
	}
	
    @Override
	public AeroplaneEntity findById(int id) {
		System.out.println("Running find by id in repo:" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity entity = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return entity;
}
}

