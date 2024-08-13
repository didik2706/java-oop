class VicePresident extends Employee {
    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My name is " + this.name + " as a Vice President");
    }
}
