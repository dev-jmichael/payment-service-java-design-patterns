package dto.request;

public class CreditCardDetailsRequest extends PaymentDetailsRequest {
    private String cardNumber;
    private String cardholderName;
    private String expirationDate;
    private String cvc;
    private String billingAddress;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\tamount='" + getAmount() + '\'' + "\n" +
                "\tcurrency='" + getCurrency() + '\'' + "\n" +
                "\tmerchantName='" + getMerchantName() + '\'' + "\n" +
                "\ttransactionDateTime='" + getTransactionDateTime() + '\'' + "\n" +
                "\tcustomerName='" + getCustomerName() + '\'' + "\n" +
                "\tcustomerEmail='" + getCustomerEmail() + '\'' + "\n" +
                "\tpaymentMethodType='" + getPaymentMethodType() + '\'' + "\n" +
                "\tcardNumber='" + cardNumber + '\'' + "\n" +
                "\tcardholderName='" + cardholderName + '\'' + "\n" +
                "\texpirationDate='" + expirationDate + '\'' + "\n" +
                "\tcvc='" + cvc + '\'' + "\n" +
                "\tbillingAddress='" + billingAddress + '\'' + "\n" +
                '}' + "\n";
    }
}
