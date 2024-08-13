package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Animal Class", tags = {"application", "java"})
public abstract class Animal {
    public String name;
//    abstract method
    public abstract void run();
}
