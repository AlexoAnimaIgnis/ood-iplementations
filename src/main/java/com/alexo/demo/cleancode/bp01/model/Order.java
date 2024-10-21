package com.alexo.demo.cleancode.bp01.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public Customer getCustomer() {
        return new Customer();
    }

    public List<Item> getItems() {
        return new ArrayList<>();
    }
}
