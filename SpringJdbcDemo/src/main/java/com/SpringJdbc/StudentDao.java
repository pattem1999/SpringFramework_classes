package com.SpringJdbc;

import java.util.List;

public interface StudentDao {

	public void insert(Student stu);
	public void update(Student stu);
	public void delete(Student stu);
	//public void retrive(Student stu);
	public List<Student> show();
}
