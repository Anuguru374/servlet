package com.xworkz.factory.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.factory.entity.FactoryEntity;

@Repository
public class FactoryRepositoryImp implements FactoryRepository 
{
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public FactoryRepositoryImp() 
	{
		System.out.println("HotelRepository Implementation Running");
	}


	


	@Override
	public boolean save(FactoryEntity factoryEntity) 
	{
		System.out.println("Save Running");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(factoryEntity);
		transaction.commit();
		entityManager.close();
		return true;
	}
	
	
	public FactoryEntity find(int id) 
	{
		System.out.println("Running find by id in repo:" + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		FactoryEntity entity = entityManager.find(FactoryEntity.class, id);
		entityManager.close();
		return entity;
}
	
	
	
	
	public List<FactoryEntity> findByFacName(String factoryName){
		System.out.println("runninng findByFacName..");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
		Query query = manager.createNamedQuery("findByFacName");
		query.setParameter("comp", factoryName);
		System.out.println("query" +query);
		
		List<FactoryEntity> list = query.getResultList();
		System.out.println("total list found in repo " + list.size());
		return list;
		
		}
		
		finally {
			manager.close();
		}
		
		}
	

	@Override
	public boolean update(FactoryEntity entity) {
		
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();
		}
		   finally {
			manager.close();
		   }	
		return true;
		}

	@Override
	public FactoryEntity deleteById(int id) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		FactoryEntity delete = manager.find(FactoryEntity.class, id);
			transaction.begin();
			manager.remove(delete);
     		transaction.commit();
     		manager.close();
		return delete;
	}	
			
		}
	
		
	

