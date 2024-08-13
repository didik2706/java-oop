package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car Interface", tags = {"application", "java"})
public interface Car extends HasBrand {
    void drive();
    int getTier();

    // default method interface
    default boolean isBig() {
        return false;
    };
}
