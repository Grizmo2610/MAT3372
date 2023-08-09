package changepaymentgateway;

public interface SmartPay {
    String getCustomerCardNo();
    String getCardOwnerName();
    String getCardExpMonthYear();
    Integer getCVVNo();
    Double getTotalAmount();

    void setCustomerCardNo(String customerCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthYear(String cardExpMonthYear);
    void setCVVNo(Integer cvvNo);
    void setTotalAmount(Double totalAmount);
}
