package com.porlity.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class school implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long SchoolID;
	private String band;
	private String nameSchool;
	private String area;
	 
	public long getSchoolID() {
		return SchoolID;
	}
	public void setSchoolID(long schoolID) {
		SchoolID = schoolID;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@OneToMany(mappedBy = "school", cascade = { CascadeType.ALL })
	private List<portfolio> portfolio;

	public List<portfolio> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(List<portfolio> portfolio) {
		this.portfolio = portfolio;
	}
}
