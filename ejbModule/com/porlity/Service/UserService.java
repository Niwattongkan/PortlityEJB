package com.porlity.Service;

import java.util.List;


import com.porlity.entity.user;

public interface UserService {
	public void insert(user user);
	public user findUser(long UserID);
	public void update(user user);
	public void delete(long UserID);
	public List<user> getAllUser();
	public List<user> getfindbyID(String id);
	public List<user> getfindbyUsername(String name);
	public List<user> getfindbyGoogle(String token_id);
}
