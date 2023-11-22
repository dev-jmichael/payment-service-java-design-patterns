package dto.request;

public class PayPalDetailsRequest extends PaymentDetailsRequest {
    private String emailOrMobileNumber;
    private String password;
    private String otp;
    private String billingInformation;

    public String getEmailOrMobileNumber() {
        return emailOrMobileNumber;
    }

    public void setEmailOrMobileNumber(String emailOrMobileNumber) {
        this.emailOrMobileNumber = emailOrMobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public String getBillingInformation() {
        return billingInformation;
    }

    public void setBillingInformation(String billingInformation) {
        this.billingInformation = billingInformation;
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
                "\temailOrMobileNumber='" + emailOrMobileNumber + '\'' + "\n" +
                "\tpassword='" + password + '\'' + "\n" +
                "\totp='" + otp + '\'' + "\n" +
                "\tbillingInformation='" + billingInformation + '\'' + "\n" +
                '}' + "\n";
    }
}
