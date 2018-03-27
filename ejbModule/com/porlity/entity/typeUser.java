package com.porlity.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class typeUser implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long typeUserID;
	private int typename;
// 1 = student
// 2 = admin
// 3 = vister
	public long getTypeUserID() {
		return typeUserID;
	}

	public void setTypeUserID(long typeUserID) {
		this.typeUserID = typeUserID;
	}

	public int getTypename() {
		return typename;
	}

	public void setTypename(int typename) {
		this.typename = typename;
	}
	@OneToOne
	private user user;

	public user getUser() {
		return user;
	}

	public void setUser(user user) {
		this.user = user;
	}

}
