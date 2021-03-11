package com.javabykirancontroller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabykiranentiry.Employee;
import com.javabykiranservice.SpringService;


@RestController
public class SpringBootHibernateIntergrationController {

	@Autowired
	SpringService springservice;
	@RequestMapping("welcome")
	public String welcomeMessage() {
		
		
		return "Welcome to first Api";
		
	}
	@GetMapping("employeelist")
    public ArrayList<Employee>  employeeList() throws SQLException, ClassNotFoundException {
		ArrayList<Employee> al=  new ArrayList<>();
		
		Employee employee1 = new Employee();
		employee1.setAge(50);
		employee1.setLoc("Pune");
		
		Employee employee2 = new Employee();
		employee2.setAge(45);
		employee2.setLoc("Mumbai");
		
		al.add(employee1);
		al.add(employee2);
		return al;
			
   }
	//Below all are JDBC
	//User1 Table
	@RequestMapping("getalluser")
	public List<String> getAllUser() throws Exception{
		System.out.println("Getting All Users ");
		List<String> listuser = springservice.getAllUser();
		return listuser;
	}
	
	@RequestMapping("getalluserbyid/{id}")
	public List<String> getAllUserById (@PathVariable("id") int id)throws Exception{
		System.out.println("Getting All Users By Id");
		List<String> listuser = springservice.getAllUserById(id);
		return listuser;
	}
	@RequestMapping("getalluserbyname/{name}")
	public List<String> getAllUserById (@PathVariable("name") String name)throws Exception{
		System.out.println("Getting All Users By Name");
		List<String> listuser = springservice.getAllUserByName(name);
		return listuser;
	}
	@RequestMapping("getalluserbystatus/{status}")
	public List<String> getAllUserByStatus(@PathVariable("status") String status)throws Exception{
		System.out.println("Getting All Users By Status");
		List<String> listuser = springservice.getAllUserByStatus(status);
		return listuser;
	}
	
	//Employee and Country Table using foreign key
	@RequestMapping("getallemployee")
	public List<String> getAllEmployee() throws Exception{
		System.out.println("Getting All Employee ");
		List<String> listuser = springservice.getAllEmployee();
		return listuser;
	}
	@RequestMapping("getallempbyid/{eid}")
	public List<String> getAllEmpById (@PathVariable("eid") int eid)throws Exception{
		System.out.println("Getting All Users By Id");
		List<String> listuser = springservice.getAllEmpById(eid);
		System.out.println("Student Added");
		return listuser;
	}
	
	
	
}
