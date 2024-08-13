package programmer.zaman.now.data;

public record LoginRequest(String username, String password) {
    // record constructor
    public LoginRequest {
        System.out.println("Called Login Request Record");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}
