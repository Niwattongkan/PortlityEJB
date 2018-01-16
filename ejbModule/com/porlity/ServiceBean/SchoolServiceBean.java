package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.porlity.Service.SchoolService;
import com.porlity.entity.school;

@Stateless
@Remote(SchoolService.class)
public class SchoolServiceBean implements SchoolService{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	
	public void insert(school school){
		this.port.persist(school);
	}
	public school findSchool(long schoolID){
		return this.port.find(school.class , schoolID);
	}
	public void update(school school){
		this.port.merge(school);
	}
	public void delete(long schoolID){
		school school = findSchool(schoolID);
		if(school != null){
			this.port.remove(school);
		}
	}
	public List<school> getAllSchool() {
		return this.port.createQuery("SELECT ent FROM school ent").getResultList();
	}
}
