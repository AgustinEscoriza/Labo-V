package com.utn.spring.repository;

import com.utn.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {

    @Query(value = "Select * from person where name = ?1", nativeQuery = true)
    List<Person> findByName(String name);
}
