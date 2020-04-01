package com.company;

import static org.graalvm.compiler.options.OptionType.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("MyName", "MySurname", "aaaa@gmail.com", "0000");
        User Guest = new User("eeee@gmail.com");
        User Guest2 = new User("iiii@gmail.com");
        User UserFromGuest = new User(Guest, "Name", "Lastname", "9999");

        Product laptop = new Product("ASUS", 2000, 123456,1);
        Product flower = new Product("peony", 5, 987654);
        laptop.setPrice();
        flower.setQuantity();
    }
}
