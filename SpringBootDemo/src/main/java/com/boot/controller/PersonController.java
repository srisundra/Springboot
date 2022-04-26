package com.boot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.model.Person;
import com.boot.service.PersonService;

@RestController
class PersonController {

	@Autowired
	private PersonService personService;

	@RequestMapping("/person")
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
				
	}
	
	@RequestMapping("/persons/{id}")
public Person getPerson(@PathVariable int id)
{
		return personService.getPerson(id);
}
}
