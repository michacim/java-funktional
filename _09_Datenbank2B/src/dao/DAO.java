package dao;

import model.Person;

import java.util.List;

public interface DAO<T> {
    //-----Standard-Methoden ----------------------------------
    boolean save(T t);
    List<T> findAll();
    T findById(int id);
    boolean delete(int id);
    //------------------------------------------------------------

    boolean update(T t);
}
