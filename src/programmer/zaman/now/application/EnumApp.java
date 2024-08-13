package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Didik");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        System.out.println(customer.getLevel().getPrice());

        // enum convertion
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        // print all enum values
        System.out.println("======= All Level Velues =========");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
