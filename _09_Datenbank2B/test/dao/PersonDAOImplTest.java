package dao;

import db.DBConnect;
import model.Person;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
class PersonDAOImplTest {
    private Connection con;
    private PersonDAOImpl dao;
    @BeforeAll
    void setUp() throws Exception {
        con = DBConnect.getInstance().connection();
        dao = new PersonDAOImpl();

        try (Statement st = con.createStatement()) {
            st.execute("""
                CREATE TABLE IF NOT EXISTS persons (
                  id INT AUTO_INCREMENT PRIMARY KEY,
                  firstname VARCHAR(100) NOT NULL,
                  lastname  VARCHAR(100) NOT NULL,
                  birthdate DATE NOT NULL
                )
            """);
        }
    }

    @BeforeEach
    void reset() throws Exception {
        // TRUNCATE ist schnell + setzt AUTO_INCREMENT zurück
        try (Statement st = con.createStatement()) {
            st.execute("TRUNCATE TABLE persons");
        }

       dao.save(new Person("Max","Meier", LocalDate.of(2000,10,10)));
       dao.save(new Person("Max","Meier", LocalDate.of(2000,10,10)));
       dao.save(new Person("Max","Meier", LocalDate.of(2000,10,10)));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
    }

    @Test
    void findAll() {
        List<Person> all = dao.findAll();
        assertEquals(3, all.size());
    }
}