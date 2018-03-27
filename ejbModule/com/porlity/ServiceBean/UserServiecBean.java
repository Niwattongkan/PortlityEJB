package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.*;
import com.porlity.entity.*;

@Stateless
@Remote(UserService.class)
public class UserServiecBean implements UserService {
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;

	public void insert(user user) {
		this.port.persist(user);
	}
	public user findUser(long UserID) {
		return this.port.find(user.class, UserID);
	}
	public user findIdGoogle(String userGoogle){
		return this.port.find(user.class, userGoogle);
	}
	public void update(user user) {
		this.port.merge(user);
	}
	public void delete(long UserID) {
		user user = findUser(UserID);
		if (user != null) {
			this.port.remove(user);
		}
	}

	public List<user> getAllUser() {
		return this.port.createQuery("SELECT ent FROM user ent").getResultList();
	}
	public List<user> getAlluserGoogle(){
		return this.port.createQuery("SELECT userGoogle FROM user").getResultList();
	}
	public List<user> getfindbyID(long id) {
		return this.port.createQuery("SELECT port FROM user port WHERE port.userID LIKE :st")
				.setParameter("st", id ).getResultList();
	}

	public List<user> getfindbyUsername(String name) {
		return this.port.createQuery("SELECT port FROM user port WHERE port.Username LIKE :uf")
				.setParameter("uf", name + "%").getResultList();
	}

	public List<user> getfindbyTypeName(String TypeName) {
		return this.port.createQuery("SELECT port FROM user port WHERE port.TypeName LIKE :uf")
				.setParameter("uf", TypeName + "%").getResultList();
	}

	public List<user> getfindbyGoogle(String userId) {
		return this.port.createQuery("SELECT port FROM user port WHERE port.userGoogle = :st")
				.setParameter("st", userId ).getResultList();
	}
	public List<user> getfindbyuserGoogle(String token_id){
		return this.port.createQuery("SELECT userGoogle FROM projectportlity.user").getResultList();
	}
}
