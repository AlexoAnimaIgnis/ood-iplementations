package com.alexo.demo.patterns.builder;

public class Demo {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder.Builder("alex", "test@email").build();
        /**
         * following lines of code is not a good practice
         * and is not thread safe
         */
        //        userBuilder.setAddress("");
        //        userBuilder.setEmail("");
    }
}
