package com.porlity.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class portfolioDetail implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long portfolioDetail;
	private String titail;
	public long getPortfolioDetail() {
		return portfolioDetail;
	}
	public void setPortfolioDetail(long portfolioDetail) {
		this.portfolioDetail = portfolioDetail;
	}
	public String getTitail() {
		return titail;
	}
	public void setTitail(String titail) {
		this.titail = titail;
	}
	@ManyToOne
	private portfolio portfolio;
	public portfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(portfolio portfolio) {
		this.portfolio = portfolio;
	}
	
	@ManyToOne
	private activity activity;
	public activity getActivity() {
		return activity;
	}
	public void setActivity(activity activity) {
		this.activity = activity;
	}
	

}
