//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /*
    Algorithmus countdown(n)
      Wenn n = 0 dann
        Ausgabe "Start"
        Abbruch
      Ende Wenn
      Ausgabe n
      countdown(n - 1)
    Ende Algorithmus
     */

    /**
     *
     * @param n - eine Zahl
     */
    public static void countdown(int n){
        if(n==0){
            System.out.println("Start");
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }
    //TODO schreibe pseudocode
    public static void go(int n){
        System.out.println("go...");

        if(n==10){
            return;
        }
        go(n+1);
    }



    public static void main(String[] args) {
        //go(1);
        countdown(10);
    }
}