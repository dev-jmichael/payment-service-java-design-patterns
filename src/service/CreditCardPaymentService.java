package service;

import dto.request.CreditCardDetailsRequest;


public class CreditCardPaymentService implements PaymentService<CreditCardDetailsRequest> {

    @Override
    public void processPayment(CreditCardDetailsRequest paymentDetailsRequest) {
        System.out.println("Payment through credit card processing...");
        System.out.println("Payment Details (CC): ");
        System.out.println(paymentDetailsRequest);
    }
}
