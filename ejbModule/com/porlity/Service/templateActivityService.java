package com.porlity.Service;

import java.util.List;

import com.porlity.entity.templateActivity;

public interface templateActivityService {
	public void insert(templateActivity temActivity);
	public templateActivity findtemplateActivity(long temId);
	public void update(templateActivity templateActivity);
	public void delete(long temId);
	public List<templateActivity> gettemplateActivty(long id);
}
