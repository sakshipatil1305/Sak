package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.pojo.Employee;

public class EmployeeDAO {

	public int addEmployee(Employee emp) {

		String INSERT_EMPLOYEE = "insert into employee1 values(?,?,?)";
		int r = 0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_EMPLOYEE);
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());
			r = ps.executeUpdate();
			return r;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

}