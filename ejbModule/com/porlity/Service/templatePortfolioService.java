package com.porlity.Service;

import java.util.List;

import com.porlity.entity.templatePortfolio;

public interface templatePortfolioService {
	public void insert(templatePortfolio temPortfolio);
	public templatePortfolio findtemplatePortfolio(long temId);
	public void update(templatePortfolio templatePortfolio);
	public void delete(long temId);
	public List<templatePortfolio> gettemplatePortfolio(long id);
}
