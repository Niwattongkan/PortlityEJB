package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.porlity.Service.InformationService;

import com.porlity.entity.information;

@Stateless
@Remote(InformationService.class)
public class InformationServiceBean implements InformationService{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	
	public void insert(information information){
		this.port.persist(information);
	}
	public information findInformation(long informationID){
		return this.port.find(information.class , informationID);
	}
	public void update(information information){
		this.port.merge(information);
	}
	public void delete(long informationID){
		information information = findInformation(informationID);
		if(information != null){
			this.port.remove(information);
		}
	}
	public List<information> getAllInformation(long id) {
		return this.port.createQuery("SELECT port FROM information port WHERE port.informationId LIKE :st")
				.setParameter("st", id ).getResultList();
	}
}
