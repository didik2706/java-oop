package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Didik";
        first = first + " Nur Hidayat";

        System.out.println(first);

        String second = "Didik Nur Hidayat";
        System.out.println(second);

        // perbandingan equals method dan operator ==
        System.out.println(first == second);
        System.out.println(first.equals(second));
    }
}
