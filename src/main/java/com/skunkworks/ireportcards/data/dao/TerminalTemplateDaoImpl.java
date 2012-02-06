package com.skunkworks.ireportcards.data.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skunkworks.ireportcards.entity.TerminalTemplate;

@Service
@Transactional
public class TerminalTemplateDaoImpl implements TerminalTemplateDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void save(TerminalTemplate template) {
		hibernateTemplate.saveOrUpdate(template);
	}

}
