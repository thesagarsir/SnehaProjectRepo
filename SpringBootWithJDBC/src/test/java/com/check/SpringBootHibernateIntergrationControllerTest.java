package com.check;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.xmlunit.input.WhitespaceNormalizedSource;

import com.javabykirancontroller.SpringBootHibernateIntergrationController;
import com.javabykiranentiry.Employee;
import com.javabykiranservice.SpringService;
import static org.mockito.Mockito.when;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class SpringBootHibernateIntergrationControllerTest {

	@InjectMocks
	SpringBootHibernateIntergrationController controller;
	
	@Mock
	SpringService springservice;
	
	@Test
	public void welcomeMessageTest() {
		String result = controller.welcomeMessage();
		
		Assert.assertNotNull(result);
		Assert.assertEquals("Welcome to first Api", result);
	}
	

	@Test
	public void employeeListTest() throws ClassNotFoundException, SQLException {
		ArrayList<Employee> result = controller.employeeList();
		
		Assert.assertNotNull(result);
	}
	
	@Test
	public void getAllUserTest() throws Exception {
		List<String> list = new ArrayList<>();
		when(springservice.getAllUser()).thenReturn(list);
		List<String> result = controller.getAllUser();
		
		Assert.assertNotNull(result);
	}
	
	@Test
	public void getAllUserByIdTest() throws Exception {
		int id = 123;
		List<String> list = new ArrayList<>();
		when(springservice.getAllUserById(id)).thenReturn(list);
		List<String> result = controller.getAllUserById(id);
		
		Assert.assertNotNull(result);
	}
	
	@Test
	public void getAllUserByIdTest1() throws Exception {
		String name = "123";
		List<String> list = new ArrayList<>();
		when(springservice.getAllUserByName(name)).thenReturn(list);
		List<String> result = controller.getAllUserById(name);
		
		Assert.assertNotNull(result);
	}
}
