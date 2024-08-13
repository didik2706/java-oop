package programmer.zaman.now.application;

import programmer.zaman.now.data.*;

public class CarApp {
    public static void main(String[] args) {
        var car = new Avanza();
        car.drive();
        System.out.println(car.isMaintenance());
        System.out.println(car.getBrand());
        System.out.println(car.getTier());

    }
}
