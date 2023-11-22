package service;

import dto.request.PayPalDetailsRequest;


public class PayPalPaymentService implements PaymentService<PayPalDetailsRequest> {

    @Override
    public void processPayment(PayPalDetailsRequest paymentDetailsRequest) {
        System.out.println("Payment through PayPal processing...");
        System.out.println("Payment Details (PP): ");
        System.out.println(paymentDetailsRequest);
    }
}
