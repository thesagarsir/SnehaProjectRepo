package com.checkService;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.javabykirandao.SpringDao;
import com.javabykiranservice.SpringService;

import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class)
public class SpringServiceTest {

	@InjectMocks
	SpringService service;
	
	@Mock
	SpringDao springdao;
	
	@Test
	public void getAllUserTest() throws Exception {
		
		List<String> listuser = new ArrayList<>();

		when(springdao.getAllUser()).thenReturn(listuser);
		List<String> list = service.getAllUser();
		
		Assert.assertNotNull(list);
	}
	
	
	
}
