package com.skunkworks.ireportcards.data.dao;

import com.skunkworks.ireportcards.entity.Student;

public interface StudentDao {

	public void save(Student student);
	public Student getByUsername(String userName);
}
