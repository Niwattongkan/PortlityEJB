package com.porlity.Service;

import java.util.List;


import com.porlity.entity.pageHeader;

public interface pageHeaderService {
	public void insert(pageHeader pageHeader);
	public pageHeader findpageHeader(long pageHeaderID);
	public void update(pageHeader pageHeader);
	public void delete(long pageHeaderID);
	public List<pageHeader> getAllpageHeader();
	public List<pageHeader> findpageHeaderBypageDetail(long empId);
	public List<pageHeader> findpageHeaderByTypePortfolio(long empId);
}
