package com.javabykiranservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykirandao.SpringDao;

@Service
public class SpringService {

	@Autowired
	SpringDao springdao;
	
	//User1 Table

	public List<String> getAllUser() throws Exception {
		List<String> listuser =springdao.getAllUser();
		return listuser;
	}
	
	public List<String> getAllUserById(int id) throws Exception {
		List<String> listuser =springdao.getAllUserById(id);
		return listuser;
	}

	public List<String> getAllUserByName(String name) throws Exception {
		System.out.println("I am in Service...Sagar");
		List<String> listuser =springdao.getAllUserByName(name);
		return listuser;
	}

	public List<String> getAllUserByStatus(String status) throws Exception {
		List<String> listuser =springdao.getAllUserByStatus(status);
		return listuser;
	}

	//Employee and Country Table using foreign key

	public List<String> getAllEmployee() throws Exception {
		List<String> listuser =springdao.getAllEmployee();
		return listuser;
	}

	public List<String> getAllEmpById(int eid) throws Exception {
		List<String> listuser =springdao.getAllEmpById(eid);
		return listuser;
	}

	

}
 