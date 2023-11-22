package model;

import constants.PaymentMethodType;

import java.time.LocalDateTime;

public class PayPalInfo extends PaymentDetails {
    private String emailOrMobileNumber;
    private String password;
    private String otp;
    private String billingInformation;
    private String billingAddress;

    public PayPalInfo(
            double amount,
            String currency,
            String merchantName,
            LocalDateTime transactionDateTime,
            String customerName,
            String customerEmail,
            PaymentMethodType paymentMethodType,
            String emailOrMobileNumber,
            String password,
            String otp,
            String billingInformation,
            String billingAddress
    ) {
        super(amount, currency, merchantName, transactionDateTime, customerName, customerEmail, paymentMethodType);
        this.emailOrMobileNumber = emailOrMobileNumber;
        this.password = password;
        this.otp = otp;
        this.billingInformation = billingInformation;
        this.billingAddress = billingAddress;
    }
}
