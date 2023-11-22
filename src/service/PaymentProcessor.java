package service;

import dto.request.PaymentDetailsRequest;


//Controller
public class PaymentProcessor<T extends PaymentDetailsRequest> {
    private final PaymentService<T> paymentService;

    public PaymentProcessor(PaymentService<T> paymentService) {
        this.paymentService = paymentService;
    }

    public void processPayment(T paymentDetailsRequest) {
        paymentService.processPayment(paymentDetailsRequest);
    }
}

