package app;

import java.util.List;

public class Service {
    static List<String> namen = List.of("Max","Otto","Anna","Lisa","Max");

    /**
     *
     * @param name (ignore whitespace), case sensitive
     * @return true if contains, else false
     */
    public static boolean isPresent(String name){
        if(name==null) return false;
        return namen.contains(name.trim());
    }


}
