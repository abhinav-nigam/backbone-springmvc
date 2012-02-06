package com.skunkworks.ireportcards.data.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skunkworks.ireportcards.entity.Level;
import com.skunkworks.ireportcards.entity.Section;

@Service
@Transactional
public class LevelDaoImpl implements LevelDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public void save(Level level) {
		hibernateTemplate.saveOrUpdate(level);
	}
}
