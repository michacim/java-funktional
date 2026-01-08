package dao;

import db.DBConnect;
import model.Person;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        return List.of();
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
