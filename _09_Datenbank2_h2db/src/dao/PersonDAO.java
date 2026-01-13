package dao;

import model.Person;

import java.util.List;

public interface PersonDAO {
    //-----Standard-Methoden ----------------------------------
    boolean save(Person person);
    List<Person> findAll();
    Person findById(int id);
    boolean delete(int id);
    //------------------------------------------------------------
    List<Person> findByLastname(String lastname);
    boolean update(Person person);
}
