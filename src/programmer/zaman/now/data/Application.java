package programmer.zaman.now.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Executed");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
