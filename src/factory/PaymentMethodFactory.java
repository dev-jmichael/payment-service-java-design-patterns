package factory;

import constants.PaymentMethodType;
import dto.request.PaymentDetailsRequest;
import service.CreditCardPaymentService;
import service.PayPalPaymentService;
import service.PaymentService;

public class PaymentMethodFactory {
    //For few subclasses creation
    public PaymentService<? extends PaymentDetailsRequest> getPaymentMethodService(PaymentMethodType paymentMethodType) {
        return switch (paymentMethodType) {
            case CREDIT_CARD -> new CreditCardPaymentService();
            case PAYPAL -> new PayPalPaymentService();
        };
    }

    //For many subclasses creation
//    private final Map<PaymentMethodType, PaymentService<? extends PaymentDetailsRequest>> services = new HashMap<>();
//
//    public PaymentMethodFactory(CreditCardPaymentService creditCardService, PayPalPaymentService payPalService) {
//        services.put(PaymentMethodType.CREDIT_CARD, creditCardService);
//        services.put(PaymentMethodType.PAYPAL, payPalService);
//    }
//
//    public PaymentService<? extends PaymentDetailsRequest> getPaymentMethodService(PaymentMethodType paymentMethodType) {
//        PaymentService<? extends PaymentDetailsRequest> service = services.get(paymentMethodType);
//        if (service == null) {
//            throw new IllegalArgumentException("Unsupported payment method: " + paymentMethodType);
//        }
//        return service;
//    }
}
