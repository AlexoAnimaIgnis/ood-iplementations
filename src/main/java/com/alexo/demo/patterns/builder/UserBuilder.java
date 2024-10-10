package com.alexo.demo.patterns.builder;

public class UserBuilder {
    private String username; // required
    private String email; // required

    private String firstname;
    private String lastname;
    private int phoneNumber;
    private String address;

    public UserBuilder(Builder builder) {

    }

    public static class Builder {
        private String username; // required
        private String email; // required

        private String firstname;
        private String lastname;
        private int phoneNumber;
        private String address;

        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder build() {
            return new UserBuilder(this);
        }
    }

    /**
     * Examples of telescoping constructor
     */
//    public UserBuilder(String username, String email) {
//        this.username = username;
//        this.email = email;
//    }

    /**
     * Examples of telescoping constructor
     */
//    public UserBuilder(String username, String email, String firstname, String lastname, int phoneNumber, String address) {
//        this.username = username;
//        this.email = email;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.phoneNumber = phoneNumber;
//        this.address = address;
//    }

}
