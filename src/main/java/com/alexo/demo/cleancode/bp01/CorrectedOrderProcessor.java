package com.alexo.demo.cleancode.bp01;

import com.alexo.demo.cleancode.bp01.model.EmailService;
import com.alexo.demo.cleancode.bp01.model.Invoice;
import com.alexo.demo.cleancode.bp01.model.Item;
import com.alexo.demo.cleancode.bp01.model.Order;

public class CorrectedOrderProcessor {
    private final EmailService emailService;

    public CorrectedOrderProcessor(
            EmailService emailService
    ) {
        this.emailService = emailService;
    }

    public void processOrder(Order order) {
        validateOrder(order);

        double totalPrice = calculateTotalPrice(order);
        if (order.getCustomer().isPremium()) {
            totalPrice *= 0.9;
        }

        Invoice invoice = generateInvoice(order, totalPrice);
        sendEmailConfirmation(invoice, order.getCustomer().getCustomerEmail());
    }

    private void validateOrder(Order order) {
        if (order == null || order.getItems().isEmpty()) {
            throw new IllegalArgumentException("Invalid order");
        }
    }

    private Double calculateTotalPrice(Order order) {

        double totalPrice = 0;
        for (Item item : order.getItems()) {
            totalPrice += item.getPrice();
        }

        return totalPrice;
    }

    private Invoice generateInvoice(Order order, Double totalPrice) {
        Invoice invoice = new Invoice(order, totalPrice);
        invoice.generate();
        return invoice;
    }

    private void sendEmailConfirmation(Invoice invoice, String email) {
        emailService.sendInvoice(invoice, email);
    }

}
