package com.porlity.ServiceBean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.porlity.Service.pageHeaderService;
import com.porlity.entity.pageHeader;




@Stateless
@Remote(pageHeaderService.class)
public class pageHeaderServiceBean implements pageHeaderService{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	public void insert(pageHeader pageHeader){
		this.port.persist(pageHeader);
	}
	public pageHeader findpageHeader(long pageHeaderID){
		return this.port.find(pageHeader.class , pageHeaderID);
	}
	public void update(pageHeader pageHeader){
		this.port.merge(pageHeader);
	}
	public void delete(long pageHeaderID){
		pageHeader pageHeader = findpageHeader(pageHeaderID);
		if(pageHeader != null){
			this.port.remove(pageHeader);
		}
	}
	public List<pageHeader> getAllpageHeader() {
		return this.port.createQuery("SELECT ent FROM pageHeader ent").getResultList();
	}
	public List<pageHeader> findpageHeaderBypageDetail(long empId) {
		return this.port.createQuery("SELECT ent FROM pageHeader ent WHERE ent.TypepageHeader.TypepageHeaderID =:param")
				.setParameter("param", empId).getResultList();
	}
	public List<pageHeader> findpageHeaderByTypePortfolio(long empId) {
		return this.port.createQuery("SELECT ent FROM pageHeader ent WHERE ent.Portfolio.PortfolioID =:param")
				.setParameter("param", empId).getResultList();
	}
}
