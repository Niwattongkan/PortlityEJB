package com.porlity.Service;

import java.util.List;

import com.porlity.entity.school;

public interface SchoolService {
	public void insert(school school);
	public school findSchool(long schoolID);
	public void update(school school);
	public void delete(long schoolID);
	public List<school> getAllSchool();
}
