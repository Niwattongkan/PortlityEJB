package com.porlity.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class activity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long activityId;
	private String page;
	public long getActivityId() {
		return activityId;
	}
	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	@OneToMany(mappedBy ="activity", cascade = { CascadeType.ALL })
	private List<portfolioDetail> portfolioDetail;

	public List<portfolioDetail> getPortfolioDetail() {
		return portfolioDetail;
	}

	public void setPortfolioDetail(List<portfolioDetail> portfolioDetail) {
		this.portfolioDetail = portfolioDetail;
	}
	@ManyToOne
	private user user;
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	
	
}
