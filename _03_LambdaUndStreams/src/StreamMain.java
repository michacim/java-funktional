import java.util.ArrayList;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<String> namen = List.of("max","ina","otto","ina","emil");
        List<String> result =    namen.stream().distinct().sorted().toList();
        System.out.println(result);


        // filter
        List<Person> persons = List.of(
                new Person(22,"Max"),
                new Person(26,"Ina"),
                new Person(44,"Anton"),
                new Person(17,"Otto")

        );


        List<Person> oldPersons = persons.stream().filter(p -> p.getAge() > 17).toList();
        System.out.println(oldPersons);
        // map
        persons.stream().map(p -> p.getName()).forEach(s -> System.out.println(s) );
        List<String> names = persons.stream()
                .map(Person::getName)//ab hier Stream<String>
                .toList();
        names.forEach(System.out::println);
        //reduce  - reduzieren auf ein Objekt
        Person person = persons.stream().reduce((p1, p2) -> p1.getAge() < p2.getAge()?p1:p2 ).get();//orElse(null)
        System.out.println(person);
        Person person2 = persons.stream().reduce(StreamMain::oldPerson ).get();//orElse(null)
        System.out.println(person);




    }

    public static Person oldPerson(Person p1, Person p2){
        return p1.getAge() > p2.getAge()?p1:p2;
    }
}

