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
import javax.persistence.OneToOne;

@Entity
public class pageHeader implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long activityID;
	private String titel;

	public long getActivityID() {
		return activityID;
	}

	public void setActivityID(long activityID) {
		this.activityID = activityID;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	@OneToOne
	private portfolio portfolio;

	public portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(portfolio portfolio) {
		this.portfolio = portfolio;
	}

	@OneToMany(mappedBy = "pageHeader", cascade = { CascadeType.ALL })
	private List<pageDetail> pageDetail;

	public List<pageDetail> getPageDetail() {
		return pageDetail;
	}

	public void setPageDetail(List<pageDetail> pageDetail) {
		this.pageDetail = pageDetail;
	};

}
