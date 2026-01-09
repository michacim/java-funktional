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
        var persons = new ArrayList<Person>();
        try {
            var ps = con.prepareStatement("SELECT * FROM persons");
            buildPersons(ps, persons);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return persons;
    }
    // Aufgabe
    @Override
    public boolean delete(int id) {
        try ( var ps = con.prepareStatement("DELETE FROM persons WHERE id=?")){
           ps.setInt(1,id);
           ps.executeUpdate();
           return ps.getUpdateCount()==1;  // 1 Datensatz gelöscht
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public List<Person> findByLastname(String lastname) {
        var findPersons = new ArrayList<Person>();
        try ( var ps = con.prepareStatement("SELECT * FROM persons WHERE lastname=?")){ //AutoClose
            ps.setString(1,lastname);
            buildPersons(ps, findPersons);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return findPersons;
    }

    @Override
    public boolean update(Person person) {
        return false;
    }

    private static void buildPersons(PreparedStatement ps, List<Person> findPersons) throws SQLException {
        var rs=   ps.executeQuery();
        while(rs.next()){
            Person p = new Person();
            p.setId(rs.getInt("id"));
            p.setFirstname(rs.getString("firstname"));
            p.setLastname(rs.getString("lastname"));
            p.setBirthdate(rs.getDate("birthdate").toLocalDate());
            findPersons.add(p);
        }
    }
}
