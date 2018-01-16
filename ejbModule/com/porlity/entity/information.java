package com.porlity.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class information implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long informationID;
	private String title;
	private String body;
	private String image;
	private String date;
	private String status;
	public long getInformationID() {
		return informationID;
	}
	public void setInformationID(long informationID) {
		this.informationID = informationID;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
