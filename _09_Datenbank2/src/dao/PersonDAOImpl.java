package dao;

import db.DBConnect;
import model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO{
    private Connection con = DBConnect.getInstance().connection();

    @Override
    public boolean save(Person person) {

        try {
            var q = """
                        INSERT INTO persons (firstname,lastname, birthdate)
                        VALUES (?,?,?)
                    """;
            PreparedStatement ps = con.prepareStatement(q);
            ps.setString(1,person.getFirstname());
            ps.setString(2,person.getLastname());
            ps.setDate(3, Date.valueOf(person.getBirthdate()));
            int n= ps.executeUpdate();
            return n==1;//genau ein Datensatz gespeichert
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Person> findAll() {
        ArrayList<Person> persons = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM persons");
            ResultSet rs=   ps.executeQuery();
            while(rs.next()){
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setFirstname(rs.getString("firstname"));
                p.setLastname(rs.getString("lastname"));
                p.setBirthdate(rs.getDate("birthdate").toLocalDate());
                persons.add(p);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return persons;
    }

    // Aufgabe
    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public List<Person> findByLastname(String lastname) {
        return List.of();
    }
}
