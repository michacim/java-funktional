package dao;

import model.Person;

import java.util.List;

public interface PersonDAO {

    boolean save(Person person);
    List<Person> findAll();
    boolean delete(int id);
    List<Person> findByLastname(String lastname);
}
