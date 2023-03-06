package com.xworkz.factory.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "factory_table")
@NamedQuery(name = "findByFacName", query = "select ent from FactoryEntity ent where ent.factoryName =:comp")
public class FactoryEntity
{
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "factoryName")
	private String factoryName;
	@Column(name = "factoryPlace")
	private String factoryPlace;
	@Column(name = "empName")
	private String empName;
	@Column(name = "empAddress")
	private String empAddress;
	@Column(name = "salary")
	private Double salary;
	
	
}
                             