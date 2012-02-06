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

import com.skunkworks.ireportcards.entity.Student;
import com.skunkworks.ireportcards.entity.Subject;
import com.skunkworks.ireportcards.entity.User;

@Service
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void save(Student student) {
		hibernateTemplate.saveOrUpdate(student);
	}

	@Override
	public Student getByUsername(final String userName) {
		User user = userDao.getByName(userName);
		if(user!=null){
			List<Student> students = hibernateTemplate.find(" from "+Student.class.getName()+" where user=?", user);
			if(!students.isEmpty()){
				return students.get(0);
			}
			else
				return null;
		}else
			return null;
	}

}
