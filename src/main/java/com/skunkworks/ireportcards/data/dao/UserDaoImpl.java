package com.skunkworks.ireportcards.data.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skunkworks.ireportcards.entity.User;

@Service
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

	@Override
	public User getByName(String userName) {
		List<User> users = hibernateTemplate.find(" from "+ User.class.getName()+" where user_name=?",userName);
		if(!users.isEmpty())
			return users.get(0);
		else
			return null;
	}

}
