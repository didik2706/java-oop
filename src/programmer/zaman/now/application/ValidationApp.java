package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.errors.ValidationException;
import programmer.zaman.now.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("didik", "");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("Data tidak valid : " + exception.getMessage());
        } finally {
            System.out.println("Block code ini akan selalu dijalankan");
        }

        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Success");;
    }
}
