package com.safety.nets.alerts.Safety.Nets.Alerts.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.Person;
import com.safety.nets.alerts.Safety.Nets.Alerts.Services.PersonService;


@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@GetMapping ("/persons")
	public @ResponseBody List<Person>  PersonList(){
		List<Person>  personList = new ArrayList<>();
		personList = personService.getAllPerson();
		return personList;
	}
	
	@PostMapping("/addperson")
	public void addPerson(@RequestBody Person person) {
		 personService.addPerson(person);
		
	}
	
	@DeleteMapping("/deleteperson/{id}")
	public void deletePerson(@PathVariable int id) {
		personService.deletePersonById(id);
	}
	
	@PutMapping("/update")
	public void updatePerson(@RequestBody Person person) {
		personService.updatePersonById(person);
	}
	
	@GetMapping ("/lastname/{lastName}")
	public @ResponseBody List<Person> getPersonByLastName(@PathVariable("lastName") String PersLastName) {
		List<Person>  personListLastName = new ArrayList<>();
		personListLastName = personService.getPersonByLastName(PersLastName);
		return personListLastName;
	}
	
	

}
