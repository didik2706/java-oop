public class PersonApp {
    public static void main(String[] args) {
        // inisiasi person class
        Person person = new Person("Dayat", "Pesisir");

        // modify attribute or filed person
        person.name = "Didik";
        person.address = "Probolinggo";
        person.sayHello("Nur");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        Person zainal = new Person("zainal");
        System.out.println(zainal.name);
    }
}
