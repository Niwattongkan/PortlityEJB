package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.*;
import com.porlity.entity.*;
@Remote(portfolioDetailService.class)
@Stateless
public class portfolioDetailServiceBean {
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	public void insert(portfolioDetail portfolioDetail) {
		this.port.persist(portfolioDetail);
	}
	public portfolioDetail findportfolioDetail(long portfolioDetailId) {
		return this.port.find(portfolioDetail.class, portfolioDetailId);
	}
	public void update(portfolioDetail portfolioDetail) {
		this.port.merge(portfolioDetail);
	}
	public void delete(long portfolioDetailId) {
		portfolioDetail portfolioDetail = findportfolioDetail(portfolioDetailId);
		if (portfolioDetail != null) {
			this.port.remove(portfolioDetail);
		}
	}
	public List<portfolioDetail> getfindbyID(long id) {
		return this.port.createQuery("SELECT port FROM portfolioDetail port WHERE port.portfolioId LIKE :st")
				.setParameter("st", id ).getResultList();
	}
}
