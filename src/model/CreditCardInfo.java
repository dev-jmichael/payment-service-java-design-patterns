package model;

import constants.PaymentMethodType;

import java.time.LocalDateTime;

public class CreditCardInfo extends PaymentDetails {
    private String cardNumber;
    private String cardholderName;
    private String expirationDate;
    private String cvc;
    private String billingAddress;

    public CreditCardInfo(
            double amount,
            String currency,
            String merchantName,
            LocalDateTime transactionDateTime,
            String customerName,
            String customerEmail,
            PaymentMethodType paymentMethodType,
            String cardNumber,
            String cardholderName,
            String expirationDate,
            String cvc,
            String billingAddress
    ) {
        super(amount, currency, merchantName, transactionDateTime, customerName, customerEmail, paymentMethodType);
        this.cardNumber = cardNumber;
        this.cardholderName = cardholderName;
        this.expirationDate = expirationDate;
        this.cvc = cvc;
        this.billingAddress = billingAddress;
    }
}
