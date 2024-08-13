package programmer.zaman.now.application;

import programmer.zaman.now.data.Cateory;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Cateory();
        category.setId("DNH001");
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
