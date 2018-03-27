package com.porlity.Service;

import java.util.List;

import com.porlity.entity.*;

public interface ActivitySerice {
	public void insert(activity activity);
	public activity findactivity(long activityId);
	public void update(activity activity);
	public void delete(long activityId);
	public List<activity> getfindbyuserID(long id);
	public activity findUser(long UserID);
}
