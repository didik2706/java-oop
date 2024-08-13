package programmer.zaman.now.application;

import programmer.zaman.now.data.*;

public class Appilcation {
    public static void main(String[] args) {
        Product product = new Product("Macbook M3 Pro Max", 35_000_000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
