import javafx.event.EventHandler;
import javafx.scene.control.Button;

@FunctionalInterface
interface MyInterface{
    int add(int a, int b);
}




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyInterface myi = (a, b) -> a +b;
        myi.add(4,5);


        Button b = new Button();
        b.setOnAction(event -> System.out.println());

    }


}