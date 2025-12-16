import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String FILE_NAME = "top10000de.txt";
    private static final String FILE_NAME_OUT = "top10000de_new.txt";


    public static void go1() {
        ArrayList<String> lines = new ArrayList<>();
        try (
                Scanner sc = new Scanner(new File(FILE_NAME));
                FileWriter fw = new FileWriter(FILE_NAME_OUT);
        ) {
            read(sc, lines);
            Collections.sort(lines);
            write(lines, fw);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void go2() {
        TreeSet<String> set = new TreeSet<>();
        try (Scanner sc = new Scanner(new File(FILE_NAME));
             FileWriter fw = new FileWriter(FILE_NAME_OUT);
        ) {
            while(sc.hasNext()){
                set.add(sc.nextLine());//sortiert und keine doppelten Einträge (TreeSet)
            }
            for(String line: set){
                fw.write(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void write(ArrayList<String> lines, FileWriter fw) throws IOException {
        for (String line : lines) {
            fw.write(line + "\n");
        }
    }

    private static void read(Scanner sc, ArrayList<String> lines) {
        while (sc.hasNext()) {
            String line = sc.nextLine();
            if (!lines.contains(line)) {
                lines.add(line);
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        go1();
        System.out.println(System.currentTimeMillis() - start);
    }
}