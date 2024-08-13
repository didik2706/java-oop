class PolymorphismApp {
    public static void main(String[] args) {
        // polymorphism implementation
        Employee employee = new Employee("Didik");
        employee.sayHello("Zainal");

        employee = new Manager("Dzun", "");
        employee.sayHello("Didik");

        employee = new VicePresident("Sam");
        employee.sayHello("Dzun");

        sayHello(new Employee("Didik"));
        sayHello(new Manager("Zainal", "Delman"));
        sayHello(new VicePresident("Sam"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello, VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Heloo, Manager " + manager.name);
        } else {
            System.out.println("Hello, Employee " + employee.name);
        }

    }
}
