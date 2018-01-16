package com.porlity.Service;

import com.porlity.entity.pageDetail;

public interface pageDetailService {
	public void insert(pageDetail pageDetail);
	public pageDetail findpageDetail(long pageDetailID);
	public void update(pageDetail pageDetail);
	public void delete(long pageDetailID);
}
