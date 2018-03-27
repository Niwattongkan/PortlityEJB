package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.*;
import com.porlity.entity.*;

@Stateless
@Remote(ActivitySerice.class)
public class ActivityServiceBean implements ActivitySerice{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	
	public void insert(activity activity) {
		this.port.persist(activity);
	}
	public activity findactivity(long activityId) {
		return this.port.find(activity.class, activityId);
	}
	public void update(activity activity) {
		this.port.merge(activity);
	}
	public void delete(long activityId) {
		activity activity = findactivity(activityId);
		if (activity != null) {
			this.port.remove(activity);
		}
	}
	public activity findUser(long UserID) {
		return this.port.find(activity.class, UserID);
	}
	public List<activity> getfindbyuserID(long id) {
		return this.port.createQuery("SELECT port FROM activity port WHERE port.user.userID LIKE :st")
				.setParameter("st", id ).getResultList();
	}

}
