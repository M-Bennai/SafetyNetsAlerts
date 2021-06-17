package com.safety.nets.alerts.Safety.Nets.Alerts.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.Person;
import com.safety.nets.alerts.Safety.Nets.Repository.PersonRepository;

@Service
public class PersonImplementation implements PersonService{
	
	PersonRepository personRepository;
	
	@Autowired
	public PersonImplementation(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void addPerson(Person person) {
	 personRepository.save(person);
		
	}

	@Override
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}
	

	@Override
	public void deletePersonById(int id) {
		personRepository.deleteById(id);
		
	}
	
	@Override
	public Person getPersonById(int id) {
		return personRepository.getById(id);
	}
	
	@Override
	public List<Person> getPersonByLastName(String lastName) {
		return personRepository.findByLastName(lastName);
	}
	
	@Override
	public List<Person> getPersonByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);
	}
	
	@Override
	public Person updatePersonById(Person person) {
		Person existingPerson= personRepository.findById(person.getId()).orElse(null);
		existingPerson.setFirstName(person.getFirstName());
		existingPerson.setLastName(person.getLastName());
		existingPerson.setAddress(person.getAddress());
		existingPerson.setCity(person.getCity());
		existingPerson.setZip(person.getZip());
		existingPerson.setPhone(person.getPhone());
		existingPerson.setEmail(person.getEmail());
		return personRepository.save(existingPerson);
	}

	//@Override
	//public void updatePersonById() {
	//	Person existingPerson = personRepository.findById(Person.getId(.orElse(other:null);
	//}

	

}
