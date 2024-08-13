package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Level Enum", tags = {"application", "java"})
public enum Level {
    STANDARD("Standard Level", 10000),
    PREMIUM("Premium Level", 150000),
    VIP("VIP Level", 2000000);

    private String description;
    private int price;

    Level(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
