package com.skunkworks.ireportcards.data.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skunkworks.ireportcards.entity.Section;
import com.skunkworks.ireportcards.entity.Student;

@Service
@Transactional
public class SectionDaoImpl implements SectionDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(Section section) {
		hibernateTemplate.save(section);
	}
}
