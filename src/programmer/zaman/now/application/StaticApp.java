package programmer.zaman.now.application;

// static import
import static programmer.zaman.now.data.Application.PROCESSORS;
import static programmer.zaman.now.data.Constant.*;

import programmer.zaman.now.data.Country;
import programmer.zaman.now.utils.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5));

        Country.City city = new Country.City();
        city.setName("Probolinggo");
        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
