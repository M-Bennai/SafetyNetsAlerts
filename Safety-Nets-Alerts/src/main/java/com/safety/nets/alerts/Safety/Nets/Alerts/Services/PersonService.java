package com.safety.nets.alerts.Safety.Nets.Alerts.Services;

import java.util.List;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.Person;

public interface PersonService {

	void addPerson(Person person);
	List<Person> getAllPerson(); 
	Person getPersonById(int id);
	void deletePersonById(int id);
	List<Person> getPersonByLastName(String lastName);
	Person updatePersonById(Person person);
	List<Person> getPersonByFirstName(String firstName);
	
}