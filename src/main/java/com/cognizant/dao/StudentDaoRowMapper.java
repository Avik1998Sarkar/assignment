package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cognizant.model.Student;

public class StudentDaoRowMapper implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st = new Student();
		st.setId(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setMarks(rs.getInt(3));
		return st;
	}
}
