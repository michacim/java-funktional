import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Arrays
        String[] names = new String[10]; //{"",""}
        names[0]  ="Max";
        System.out.println(Arrays.toString(names));//Methoden in der Klasse Arrays

        // ArrayList
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Max");
        namen.add(" Max");
        namen.add("Otto");
        namen.add("Ina");
        namen.add("ina");
        System.out.println(namen);
       // namen.sort(null);
        Collections.sort(namen);
        System.out.println(namen);

       if(! namen.contains("otto")){
           System.out.println("otto nicht gefunden");
       }else{
           System.out.println("Guten Tag otto");
       }

       ArrayList<Person> persons = new ArrayList<>();
       persons.add(new Person(22,"erna"));
       persons.add(new Person(26,"lisa"));
        System.out.println(persons);
        System.out.println(persons.contains(new Person(22,"erna")));

        Person p1 = new Person(10,"otto");
        Person p2 = new Person(10,"otto");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));


    }
}