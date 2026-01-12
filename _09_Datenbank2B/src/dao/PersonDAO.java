package dao;

import model.Person;

import java.util.List;

public interface PersonDAO extends  DAO<Person>{
    List<Person> findByLastname(String lastname);
}
