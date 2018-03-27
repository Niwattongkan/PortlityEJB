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
import javax.persistence.OneToOne;

@Entity
public class user implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userID;
	private String nicName;
	private String firstName;
	private String surName;
	private String address;
	private String email;
	private String classroom;
	private String birthDay;
	private String age;
	private String phone;
	private String hight;
	private String wight; 
	private String historyEducattionPrimary;
	private String historyEducattionHihgthschool13;
	private String historyEducattionHihgthschool46;
	private String userGoogle;

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getNicName() {
		return nicName;
	}

	public void setNicName(String nicName) {
		this.nicName = nicName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHight() {
		return hight;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

	public String getWight() {
		return wight;
	}

	public void setWight(String wight) {
		this.wight = wight;
	}

	public String getHistoryEducattionPrimary() {
		return historyEducattionPrimary;
	}

	public void setHistoryEducattionPrimary(String historyEducattionPrimary) {
		this.historyEducattionPrimary = historyEducattionPrimary;
	}

	public String getHistoryEducattionHihgthschool13() {
		return historyEducattionHihgthschool13;
	}

	public void setHistoryEducattionHihgthschool13(String historyEducattionHihgthschool13) {
		this.historyEducattionHihgthschool13 = historyEducattionHihgthschool13;
	}

	public String getHistoryEducattionHihgthschool46() {
		return historyEducattionHihgthschool46;
	}

	public void setHistoryEducattionHihgthschool46(String historyEducattionHihgthschool46) {
		this.historyEducattionHihgthschool46 = historyEducattionHihgthschool46;
	}

	public String getUserGoogle() {
		return userGoogle;
	}

	public void setUserGoogle(String userGoogle) {
		this.userGoogle = userGoogle;
	}

	@OneToOne(mappedBy = "user", cascade = { CascadeType.ALL })
	private typeUser typeUser;

	public typeUser getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(typeUser typeUser) {
		this.typeUser = typeUser;
	}

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL })
	private List<portfolio> portfolio;

	public List<portfolio> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(List<portfolio> portfolio) {
		this.portfolio = portfolio;
	}
	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL })
	private List<activity> activity;

	public List<activity> getActivity() {
		return activity;
	}

	public void setActivity(List<activity> activity) {
		this.activity = activity;
	}
	
}
