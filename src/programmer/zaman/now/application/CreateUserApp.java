package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.utils.ValidationUtil;

public class CreateUserApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("didik");
        request.setPassword("didik");

        ValidationUtil.validationReflection(request);
    }
}
