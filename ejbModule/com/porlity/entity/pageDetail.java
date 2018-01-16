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

@Entity
public class pageDetail implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long pageDetail;
	private String title;
	private String body;
	private String image;

	public long getPageDetail() {
		return pageDetail;
	}

	public void setPageDetail(long pageDetail) {
		this.pageDetail = pageDetail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@ManyToOne
	private pageHeader pageHeader;

	public pageHeader getPageHeader() {
		return pageHeader;
	}

	public void setPageHeader(pageHeader pageHeader) {
		this.pageHeader = pageHeader;
	}

}
