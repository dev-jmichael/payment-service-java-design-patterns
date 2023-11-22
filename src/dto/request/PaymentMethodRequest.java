package dto.request;

import constants.PaymentMethodType;

public class PaymentMethodRequest {
    private PaymentMethodType paymentMethodType;

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }
}
