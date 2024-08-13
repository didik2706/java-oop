package programmer.zaman.now.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println();
    }

    @Override
    public int getTier() {
        return 0;
    }

    @Override
    public boolean isBig() {
        return Car.super.isBig();
    }

    @Override
    public String getBrand() {
        return "";
    }
}
