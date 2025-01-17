package programmer.zaman.now.data;

import programmer.zaman.now.annotation.NotBlank;

public class CreateUserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
