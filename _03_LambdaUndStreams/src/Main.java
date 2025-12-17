import javafx.event.EventHandler;
import javafx.scene.control.Button;

//Interface mit genau einer Methode
@FunctionalInterface
interface MyInterface{
    /**
     *
     * @param a - eine Zahl
     * @param b - eine Zahl
     * @return - summe aus a und b
     */
    int add(int a, int b) ;
}




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void test(MyInterface mi){
        System.out.println(mi.add(1,3));
    }

    public static void main(String[] args) {

//        MyInterface myi = (a, b) -> a + b;
//        myi.add(4,5);
//
//
//        Button b = new Button();
//        b.setOnAction(event -> System.out.println());

        test((a, b) -> a + b);

    }

}
//class MyClass implements MyInterface{
//
//    @Override
//    public int add(int a, int b) {
//        return a +b ;
//    }
//}