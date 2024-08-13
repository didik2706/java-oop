class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // constructor overloading 1
    Person(String name) {
        // cara 1
        // name = paramName;
        // cara 2
        this(name, null);
    }

    // constructor overloading 2
    Person() {}

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name);
    }
}
