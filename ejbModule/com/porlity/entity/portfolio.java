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
public class portfolio implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long portfolioID;
	private String templateName;

	public long getPortfolioID() {
		return portfolioID;
	}

	public void setPortfolioID(long portfolioID) {
		this.portfolioID = portfolioID;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	@ManyToOne
	private user user;

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

	@OneToOne(mappedBy = "portfolio", cascade = { CascadeType.ALL })
	private pageHeader pageHeader;

	public pageHeader getPageHeader() {
		return pageHeader;
	}

	public void setPageHeader(pageHeader pageHeader) {
		this.pageHeader = pageHeader;
	}

}
