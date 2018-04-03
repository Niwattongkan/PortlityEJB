package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.templatePortfolioService;
import com.porlity.entity.templatePortfolio;

@Stateless
@Remote(templatePortfolioService.class)
public class templatePortfolioServiceBean {
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	
	public void insert(templatePortfolio temPortfolio){
		this.port.persist(temPortfolio);
	}
	public templatePortfolio findtemplatePortfolio(long temId){
		return this.port.find(templatePortfolio.class, temId );
	}
	public void update(templatePortfolio templatePortfolio){
		this.port.merge(templatePortfolio);
	}
	public void delete(long temId){
		templatePortfolio tem = findtemplatePortfolio(temId);
		if(tem != null){
			this.port.remove(tem);
		}
	}
	public List<templatePortfolio> gettemplatePortfolio(long id){
		return this.port.createQuery("SELECT port FROM templatePortfolio port WHERE port.templatePortfolioId LIKE :st")
				.setParameter("st", id).getResultList();
	}
}
