package dao;

import db.DBConnect;
import model.Person;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)//  @BeforeAll
class PersonDAOImplTest {

    private Connection con;
    private PersonDAOImpl dao;

    @BeforeAll // wird einmalig am Anfang ausgeführt
    void setUp() {
        con = DBConnect.getInstance().connection();//oder eigene Test-Connection aufbauen
        dao = new PersonDAOImpl();
        try (Statement st = con.createStatement()){
            st.execute("""
                    CREATE TABLE IF NOT EXISTS persons(
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        firstname VARCHAR(100) NOT NULL,
                        lastname VARCHAR(100) NOT NULL,
                        birthdate DATE NOT NULL
                 
                    )
                   """);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeEach //wird vor jeder @Test-Methode ausgeführt
    void reset(){
        try ( Statement st = con.createStatement()){
            st.execute("TRUNCATE TABLE persons");
            dao.save(new Person("Max","Meier", LocalDate.of(2000, Month.APRIL,12)));
            dao.save(new Person("Ina","Lehmann", LocalDate.of(1967, Month.MARCH,22)));
            dao.save(new Person("Anna","Schultz", LocalDate.of(2010, Month.APRIL,1)));

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
    }

    @Test
    void findAll() {
       List<Person> all=  dao.findAll();
       assertNotNull(all);
       assertEquals(3,all.size());

    }

}