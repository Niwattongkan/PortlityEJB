package com.porlity.Service;

import java.util.List;


import com.porlity.entity.user;

public interface UserService {
	public void insert(user user);
	public user findUser(long UserID);
	public user findIdGoogle(String userGoogle);
	public void update(user user);
	public void delete(long UserID);
	public List<user> getAllUser();
	public List<user> getfindbyID(long id);
	public List<user> getfindbyUsername(String name);
	public List<user> getfindbyGoogle(String token_id);
	public List<user> getfindbyuserGoogle(String token_id);
	public List<user> getAlluserGoogle();
}
