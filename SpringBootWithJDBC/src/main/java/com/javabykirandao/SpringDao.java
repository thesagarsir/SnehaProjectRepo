package com.javabykirandao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SpringDao {
	
	Connection connection;
	public Connection getConnection() throws Exception { //we created method here becaz no need to connection again and again
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return connection;
	}
	
	//User1 Table

	public List<String> getAllUser() throws Exception{
		
		SpringDao dao = new SpringDao();

		Connection connection =dao.getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "Select * from demo";
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> arraylist_user = new ArrayList<>();
		while(rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			arraylist_user.add(id);
			arraylist_user.add(name);
		}
		System.out.println(arraylist_user);
		return arraylist_user	;
	}

	public List<String> getAllUserById(int id) throws Exception {
		SpringDao dao = new SpringDao();

		Connection connection =dao.getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "Select * from demo where id = " + id;
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> arraylist_user = new ArrayList<>();
		while(rs.next()) {
			String name = rs.getString("name");
			arraylist_user.add(name);
		}
		System.out.println(arraylist_user);
		return arraylist_user	;
	}

	public List<String> getAllUserByName(String name) throws Exception {
		SpringDao dao = new SpringDao();

		Connection connection =dao.getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "Select * from demo where name = '"+name+"'";
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> arraylist_user = new ArrayList<>();
		while(rs.next()) {
			String id = rs.getString("id");
			
			arraylist_user.add(id);
		}
		System.out.println(arraylist_user);
		return arraylist_user;
	}

	public List<String> getAllUserByStatus(String status) throws Exception {
		SpringDao dao = new SpringDao();

		Connection connection =dao.getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "Select * from demo where status = '"+status+"'";
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> arraylist_user = new ArrayList<>();
		while(rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			String contact = rs.getString("contact");
			String address = rs.getString("address");
			String 	username = rs.getString("username");
			
			arraylist_user.add(id);
			arraylist_user.add(name);
			arraylist_user.add(contact);
			arraylist_user.add(address);
			arraylist_user.add(username);
		}
		System.out.println(arraylist_user);
		return arraylist_user;
	}

	//Employee and Country Table using foreign key

	public List<String> getAllEmployee() throws Exception {
		SpringDao dao = new SpringDao();

		Connection connection =dao.getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "Select * from employee";
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> arraylist_user = new ArrayList<>();
		while(rs.next()) {
			String eid = rs.getString("eid");
			String ename = rs.getString("ename");
			String age = rs.getString("age");
			String loc = rs.getString("loc");
			String 	createdtm = rs.getString("createdtm");
			String cid = rs.getString("cid");

			
			arraylist_user.add(eid);
			arraylist_user.add(ename);
			arraylist_user.add(age);
			arraylist_user.add(loc);
			arraylist_user.add(createdtm);
			arraylist_user.add(cid);
	
		}
		System.out.println(arraylist_user);
		return arraylist_user	;
	}

	public List<String> getAllEmpById(int eid) throws Exception {
		SpringDao dao = new SpringDao();

		Connection connection =dao.getConnection();
		
		Statement stmt = connection.createStatement();
		String query = "Select * from employee where eid =" + eid;
		
		ResultSet rs = stmt.executeQuery(query);
		ArrayList<String> arraylist_user = new ArrayList<>();
		while(rs.next()) {
			
			String ename = rs.getString("ename");
			String age = rs.getString("age");
			String loc = rs.getString("loc");
			String 	createdtm = rs.getString("createdtm");
			String cid = rs.getString("cid");
	
			arraylist_user.add(ename);
			arraylist_user.add(age);
			arraylist_user.add(loc);
			arraylist_user.add(createdtm);
			arraylist_user.add(cid);
	
		}
		System.out.println(arraylist_user);
		return arraylist_user	;
	}

	}


