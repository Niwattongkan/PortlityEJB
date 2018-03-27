package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.porlity.Service.*;
import com.porlity.entity.*;

@Stateless
@Remote(PortfolioService.class)
public class PortfolioServiceBean implements PortfolioService{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	
	public void insert(portfolio portfolio){
		this.port.persist(portfolio);
	}
	public portfolio findPortfolio(long PortfolioID){
		return this.port.find(portfolio.class , PortfolioID);
	}
	public void update(portfolio portfolio){
		this.port.merge(portfolio);
	}
	public void delete(long PortfolioID){
		portfolio portfolio = findPortfolio(PortfolioID);
		if(portfolio != null){
			this.port.remove(portfolio);
		}
	}
	public List<portfolio> getAllPortfolio() {
		return this.port.createQuery("SELECT port FROM portfolio ent").getResultList();
	}
	public List<portfolio> findPortfolioByStudentId(long Id) {
		return this.port.createQuery("SELECT port FROM portfolio port WHERE port.userID =:param")
				.setParameter("param", Id).getResultList();
	}
	public List<portfolio> getPortfoliofindbyUserId(String userId){
		return this.port.createQuery("SELECT port FROM portfolio.userId = :st")
				.setParameter("st", userId).getResultList();
	}
}
