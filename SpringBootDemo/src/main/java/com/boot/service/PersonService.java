package com.boot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.model.Person;

@Service
public class PersonService {

	private List<Person> persons=Arrays.asList(new Person(101,"Sridevi","abc"),
			new Person(102,"Sam","xyz"),
			new Person(103,"Venkat","Ram"));
	
	public List<Person> getAllPersons()
	{
		return persons;
	}
	
	public Person getPerson(int id)
	{
		return persons.stream().filter(t->t.getId()==id).findFirst().get();
	}

	}
