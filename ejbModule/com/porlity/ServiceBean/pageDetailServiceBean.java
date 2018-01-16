package com.porlity.ServiceBean;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import com.porlity.Service.pageDetailService;
import com.porlity.entity.pageDetail;

@Stateless
@Remote(pageDetailService.class)
public class pageDetailServiceBean implements pageDetailService{
	@PersistenceContext(unitName = "myDatabase")
	EntityManager port;
	public void insert(pageDetail pageDetail){
		this.port.persist(pageDetail);
	}
	public pageDetail findpageDetail(long pageDetailID){
		return this.port.find(pageDetail.class , pageDetailID);
	}
	public void update(pageDetail pageDetail){
		this.port.merge(pageDetail);
	}
	public void delete(long pageDetailID){
		pageDetail pageDetail = findpageDetail(pageDetailID);
		if(pageDetail != null){
			this.port.remove(pageDetail);
		}
	}
	
}
