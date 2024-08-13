package programmer.zaman.now.application;

import programmer.zaman.now.errors.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("test", null);
        System.out.println("Success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Gagal konek ke database");
        }
    }
}
