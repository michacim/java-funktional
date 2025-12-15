import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void writeText(String filename) {
        try (FileWriter fw = new FileWriter(filename)){// AutoClose

            fw.write("Hallo\nGuten Tag\n");
            fw.write("Max");
            fw.write(System.lineSeparator());
            fw.write("Wie geht's?");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void writeText2(String filename) {
        try (BufferedWriter fw = new BufferedWriter( new FileWriter(filename))){// AutoClose
            for (int i = 0; i < 100000; i++) {
               fw.write("Hallo "+i+"\n");
               // String s = String.format("Hallo %d\n",i);
               // fw.write(s);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void readText(String filename){
        try (Scanner sc = new Scanner(new File(filename))){
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
            //Main.writeText("out.txt");
       // Main.readText("out.txt");
        long start = System.currentTimeMillis();
        //Main.writeText2("out2.txt");

        Main.readText("out2.txt");
        System.out.println(System.currentTimeMillis() - start);
    }
}