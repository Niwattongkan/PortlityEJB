package com.porlity.Service;

import java.util.List;

import com.porlity.entity.portfolioDetail;

public interface portfolioDetailService {
	public void insert(portfolioDetail portfolioDetail);
	public portfolioDetail findportfolioDetail(long portfolioDetailId);
	public void update(portfolioDetail portfolioDetail);
	public void delete(long portfolioDetailId);
	public List<portfolioDetail> getfindbyID(long id);
}
