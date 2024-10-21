package com.alexo.demo.cleancode.bp01;

import com.alexo.demo.cleancode.bp01.model.EmailService;
import com.alexo.demo.cleancode.bp01.model.Invoice;
import com.alexo.demo.cleancode.bp01.model.Item;
import com.alexo.demo.cleancode.bp01.model.Order;

public class OrderProcessor {

    public void processOrder(Order order) {
        // Validate order
        if (order == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Invalid order");
        }

        // Calculate total price
        double totalPrice = 0;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice();
        }

        // Apply discount
        if (order.getCustomer().isPremium()) {
            totalPrice *= 0.9;
        }

        // Generate invoice
        Invoice invoice = new Invoice(order, totalPrice);
        invoice.generate();

        // Send email confirmation
        EmailService emailService = new EmailService();
        emailService.sendInvoice(invoice, order.getCustomer().getCustomerEmail());
    }
}
