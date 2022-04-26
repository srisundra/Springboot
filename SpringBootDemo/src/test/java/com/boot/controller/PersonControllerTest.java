package com.boot.controller;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.boot.service.PersonService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class PersonControllerTest {

	@Autowired
	private PersonController personController;
	
	@MockBean
	private PersonService personService;
	
	private static ObjectMapper mapper=new ObjectMapper();
	
	@Test
	public void test
	@Test
	public void testAddPerson()
	
	{
		
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
