import dao.PersonDAOImpl;
import db.DBConnect;
import model.Person;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PersonDAOImpl dao = new PersonDAOImpl();
        Person p1 = new Person("Anna","Meier", LocalDate.of(2000,10,1));
       // System.out.println(dao.save(p1));

        System.out.println(dao.findAll());

        //2
        //Max
        //Meier
        //1999-04-02

        Person p2 = new Person("Otto","Krause", LocalDate.of(2000,10,1));
        System.out.println(dao.save(p2));
        p2.setLastname("Lehmann");

        System.out.println( dao.update(p2));
    }
}