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

        System.out.println(dao.findAll().size());

    }
}