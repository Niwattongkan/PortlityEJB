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
	private String username;
	private String password;
	private String nicname;
	private String name;
	private String surname;
	private String address;
	private String email;
	private String classroom;

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNicname() {
		return nicname;
	}

	public void setNicname(String nicname) {
		this.nicname = nicname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
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
}
