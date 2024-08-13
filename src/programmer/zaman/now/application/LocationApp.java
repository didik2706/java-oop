package programmer.zaman.now.application;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); abstract tidak bisa digunakan untuk inisiasi object
        var city = new City();
        city.name = "Probolinggo";

        System.out.println(city.name);
    }
}
