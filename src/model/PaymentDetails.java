package model;

import constants.PaymentMethodType;

import java.time.LocalDateTime;

public abstract class PaymentDetails {
    protected double amount;
    protected String currency;
    protected String merchantName;
    protected LocalDateTime transactionDateTime;
    protected String customerName;
    protected String customerEmail;
    protected PaymentMethodType paymentMethodType;

    public PaymentDetails(double amount, String currency, String merchantName, LocalDateTime transactionDateTime, String customerName, String customerEmail, PaymentMethodType paymentMethodType) {
        this.amount = amount;
        this.currency = currency;
        this.merchantName = merchantName;
        this.transactionDateTime = transactionDateTime;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.paymentMethodType = paymentMethodType;
    }
}
