package com.porlity.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class templateActivity implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long templateActivityId;
	private String title;
	private String bodyHTML;
	public long getTemplateActivityId() {
		return templateActivityId;
	}
	public void setTemplateActivityId(long templateActivityId) {
		this.templateActivityId = templateActivityId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBodyHTML() {
		return bodyHTML;
	}
	public void setBodyHTML(String bodyHTML) {
		this.bodyHTML = bodyHTML;
	}
	
	
}
