package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;
import com.pojo.Employee;

public class EmployeeDAO {

	public List<Employee> findAllEmployees() {
		Connection com = MyConnection.getMyConnection();
		List<Employee> employee = new ArrayList<>();

		String SELECT_ALL = "select * from employee1";

		try {
			Statement st = com.createStatement();
			ResultSet set = st.executeQuery(SELECT_ALL);

			while (set.next()) {
				Employee emp = new Employee();
				emp.setEmpid(set.getInt(1));
				emp.setName(set.getString(2));
				emp.setSalary(set.getInt(3));
				employee.add(emp);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;

	}
}
