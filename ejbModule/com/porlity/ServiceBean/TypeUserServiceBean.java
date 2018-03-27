package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.*;
import com.porlity.entity.*;

@Stateless
@Remote(TypeUserService.class)
public class TypeUserServiceBean implements TypeUserService{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	public void insert(typeUser typeUser){
		this.port.persist(typeUser);
	}
	public typeUser findTypeUser(long typeUserID){
		return this.port.find(typeUser.class , typeUserID);
	}
	public void update(typeUser typeUser){
		this.port.merge(typeUser);
	}
	public void delete(long typeUserID){
		typeUser typeUser = findTypeUser(typeUserID);
		if(typeUser != null){
			this.port.remove(typeUser);
		}
	}
	public List<typeUser> findtypeUserByName(String Name){
		return this.port.createQuery("SELECT port FROM typeUser port WHERE port.Name =:st")
							.setParameter("st", Name).getResultList();
	}
	public List<typeUser> findtypeUserbyUesr(long uesrID){
		return this.port.createQuery("SELECT port FROM typeUser WHERE port.typeUser.userId =:param")
				.setParameter("param", uesrID).getResultList();
	}
}
