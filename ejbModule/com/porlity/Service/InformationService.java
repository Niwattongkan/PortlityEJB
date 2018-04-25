package com.porlity.Service;

import java.util.List;

import com.porlity.entity.information;

public interface InformationService {
	public void insert(information information);
	public information findInformation(long informationID);
	public void update(information information);
	public void delete(long informationID);
	public List<information> getAllInformation(String id);
	public List<information> getAll();
}
