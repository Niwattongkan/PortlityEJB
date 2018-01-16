package com.porlity.Service;

import java.util.List;

import com.porlity.entity.typeUser;

public interface TypeUserService {
	public void insert(typeUser typeUser);
	public typeUser findTypeUser(long typeUserID);
	public void update(typeUser typeUser);
	public void delete(long typeUserID);
	public List<typeUser> findtypeUserbyUesr(long uesrID);
}
