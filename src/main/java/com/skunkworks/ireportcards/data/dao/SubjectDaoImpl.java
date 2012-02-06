package com.skunkworks.ireportcards.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skunkworks.ireportcards.entity.Subject;

@Service
@Transactional
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Subject subject) {
		hibernateTemplate.saveOrUpdate(subject);
	}

}
