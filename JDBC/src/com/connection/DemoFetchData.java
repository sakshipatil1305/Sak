package com.connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoFetchData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con = MyConnection.getMyConnection();
		String Find_All_EMPLOYEE1 = "select * from employee1";

		Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet set = statement.executeQuery(Find_All_EMPLOYEE1);

//			DatabaseMetaData md=con.getMetaData();
//			System.out.println(md.getDatabaseProductName());
//			ResultSetMetaData rmd = set.getMetaData();
//			System.out.println("no of col:- "+rmd.getColumnCount());
//			for(int i=1;i<=rmd.getColumnCount();i++){
//				System.out.println(rmd.getColumnLabel(i));
//			}
		while (set.next()) {
			int empid = set.getInt(1);
			String name = set.getString(2);
			int salary = set.getInt(3);
			System.out.println(empid + " " + name + " " + salary);
			set.updateInt(3, 12100);
			set.updateRow();
		}

	}

}
