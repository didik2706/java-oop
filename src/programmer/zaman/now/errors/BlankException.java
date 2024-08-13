package programmer.zaman.now.errors;

public class BlankException extends RuntimeException {
    // exception yang akan diabaikan oleh java
    public BlankException(String message) {
        super(message);
    }
}
