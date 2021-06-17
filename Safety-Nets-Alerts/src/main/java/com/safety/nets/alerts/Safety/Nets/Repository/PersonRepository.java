package com.safety.nets.alerts.Safety.Nets.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.safety.nets.alerts.Safety.Nets.Alerts.Models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

	List<Person> findByLastName(String lastName);
	List<Person> findByFirstName(String firstName);

}
