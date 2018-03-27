package com.porlity.Service;

import java.util.List;

import com.porlity.entity.portfolio;

public interface PortfolioService {
	public void insert(portfolio portfolio);
	public portfolio findPortfolio(long PortfolioID);
	public void update(portfolio portfolio);
	public void delete(long PortfolioID);
	public List<portfolio> getAllPortfolio();
	public List<portfolio> findPortfolioByStudentId(long Id);
	public List<portfolio> getPortfoliofindbyUserId(String userId);
}
