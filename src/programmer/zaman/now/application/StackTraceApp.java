package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = { "Didik", "Nur", "Hidayat" };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
