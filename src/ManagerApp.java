public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Didik", "Cranium");
        manager.name = "Didik";
        manager.sayHello("Budi");

        var vp = new VicePresident("Didik");
        vp.name = "Joko";
        vp.sayHello("Budi");

        System.out.println(manager.toString());
        System.out.println(vp.toString());
    }
}
