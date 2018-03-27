package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.templateActivityService;
import com.porlity.entity.templateActivity;

@Stateless
@Remote(templateActivityService.class)
public class templateActivityServiceBean {
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	
	public void insert(templateActivity temActivity){
		this.port.persist(temActivity);
	}
	public templateActivity findtemplateActivity(long temId){
		return this.port.find(templateActivity.class, temId );
	}
	public void update(templateActivity templateActivity){
		this.port.merge(templateActivity);
	}
	public void delete(long temId){
		templateActivity tem = findtemplateActivity(temId);
		if(tem != null){
			this.port.remove(tem);
		}
	}
	public List<templateActivity> gettemplateActivty(long id){
		return this.port.createQuery("SELECT port FROM templateActivity port WHERE port.templateActivityId LIKE :st")
				.setParameter("st", id).getResultList();
	}
}
