package com.akshay.person.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akshay.person.models.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person ,Integer> {

	

}
