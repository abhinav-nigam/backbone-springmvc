package com.skunkworks.ireportcards.data.dao;

import com.skunkworks.ireportcards.entity.User;

public interface UserDao {

	public void save(User user);
	public User getByName(String userName);
}
