package programmer.zaman.now.application;

import programmer.zaman.now.data.Car;
import programmer.zaman.now.data.IsMaintenance;

public class Avanza implements Car, IsMaintenance {
    public void drive() {
        System.out.println("Avanza drive");
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }

    public int getTier() {
        return 1;
    }
}
