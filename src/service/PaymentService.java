package service;


import dto.request.PaymentDetailsRequest;


public interface PaymentService<T extends PaymentDetailsRequest> {
    void processPayment(T paymentDetailsRequest);
}
