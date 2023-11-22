
import constants.PaymentMethodType;
import dto.request.CreditCardDetailsRequest;
import dto.request.PayPalDetailsRequest;
import dto.request.PaymentMethodRequest;
import factory.PaymentMethodFactory;
import service.CreditCardPaymentService;
import service.PayPalPaymentService;
import service.PaymentProcessor;
import service.PaymentService;

import java.time.LocalDateTime;

public class Main {
    @SuppressWarnings("rawtypes")
    private static PaymentService getPaymentService(PaymentMethodRequest paymentMethodRequest) {
        //Inject this on factory if needed
        CreditCardPaymentService creditCardPaymentService = new CreditCardPaymentService();
        PayPalPaymentService payPalPaymentService = new PayPalPaymentService();

        PaymentMethodFactory factory = new PaymentMethodFactory();
        return factory.getPaymentMethodService(paymentMethodRequest.getPaymentMethodType());
    }
    private static CreditCardDetailsRequest getCreditCardDetailsRequest() {
        CreditCardDetailsRequest paymentDetailsRequest = new CreditCardDetailsRequest();
        paymentDetailsRequest.setAmount(20.00);
        paymentDetailsRequest.setCurrency("USD");
        paymentDetailsRequest.setMerchantName("ChatGPT OpenAI");
        paymentDetailsRequest.setTransactionDateTime(LocalDateTime.now());
        paymentDetailsRequest.setCustomerName("John Doe");
        paymentDetailsRequest.setCustomerEmail("john.doe@example.com");
        paymentDetailsRequest.setPaymentMethodType(PaymentMethodType.CREDIT_CARD);

        paymentDetailsRequest.setCardNumber("1234 5678 9012 3456");
        paymentDetailsRequest.setCardholderName("John Doe");
        paymentDetailsRequest.setExpirationDate("12/25");
        paymentDetailsRequest.setCvc("123");
        paymentDetailsRequest.setBillingAddress("123 Main St, Hometown, ABC");
        return paymentDetailsRequest;
    }
    private static PayPalDetailsRequest getPayPalDetailsRequest() {
        PayPalDetailsRequest paymentDetailsRequest = new PayPalDetailsRequest();
        paymentDetailsRequest.setAmount(20.00);
        paymentDetailsRequest.setCurrency("USD");
        paymentDetailsRequest.setMerchantName("ChatGPT OpenAI");
        paymentDetailsRequest.setTransactionDateTime(LocalDateTime.now());
        paymentDetailsRequest.setCustomerName("John Doe");
        paymentDetailsRequest.setCustomerEmail("john.doe@example.com");
        paymentDetailsRequest.setPaymentMethodType(PaymentMethodType.PAYPAL);

        paymentDetailsRequest.setEmailOrMobileNumber("user@example.com");
        paymentDetailsRequest.setPassword("strongpassword123");
        paymentDetailsRequest.setOtp("123456");
        paymentDetailsRequest.setBillingInformation("1234 Main St, Springfield, USA");
        return paymentDetailsRequest;
    }
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        PaymentMethodRequest paymentMethodRequestCC = new PaymentMethodRequest();
        paymentMethodRequestCC.setPaymentMethodType(PaymentMethodType.CREDIT_CARD);
        PaymentService serviceCC = getPaymentService(paymentMethodRequestCC);
        CreditCardDetailsRequest paymentDetailsRequestCC = getCreditCardDetailsRequest();

        PaymentMethodRequest paymentMethodRequestPP = new PaymentMethodRequest();
        paymentMethodRequestPP.setPaymentMethodType(PaymentMethodType.PAYPAL);
        PaymentService servicePP = getPaymentService(paymentMethodRequestPP);
        PayPalDetailsRequest paymentDetailsRequestPP = getPayPalDetailsRequest();

        PaymentProcessor paymentProcessorCC = new PaymentProcessor(serviceCC);
        paymentProcessorCC.processPayment(paymentDetailsRequestCC);

        PaymentProcessor paymentProcessorPP = new PaymentProcessor(servicePP);
        paymentProcessorPP.processPayment(paymentDetailsRequestPP);
    }
}
