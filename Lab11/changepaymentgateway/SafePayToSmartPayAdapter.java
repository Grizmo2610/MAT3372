package designpattern.adapter.changepaymentgateway;

public class SafePayToSmartPayAdapter implements SmartPay{
    private String customerCardNo;
    private String cardOwnerName;
    private String cardExpMonthYear;
    private Integer cvvNo;
    private Double totalAmount;

    private final SafePay safePay;

    public SafePayToSmartPayAdapter (SafePay safePay){
        this.safePay = safePay;
        setFields();
    }

    @Override
    public String getCustomerCardNo() {
        return customerCardNo;
    }

    @Override
    public void setCustomerCardNo(String customerCardNo) {
        this.customerCardNo = customerCardNo;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public String getCardExpMonthYear() {
        return cardExpMonthYear;
    }

    @Override
    public void setCardExpMonthYear(String cardExpMonthYear) {
        this.cardExpMonthYear = cardExpMonthYear;
    }

    public Integer getCVVNo() {
        return cvvNo;
    }

    public void setCVVNo(Integer cvvNo) {
        this.cvvNo = cvvNo;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public SafePay getSafePay() {
        return safePay;
    }

    private void setFields(){
        setCardOwnerName(this.safePay.getCustomerName());
        setCustomerCardNo(this.safePay.getCreditCardNo());
        setCardExpMonthYear(this.safePay.getCardExpMonth() + "/" + this.safePay.getCardExpYear());
        setCVVNo(this.safePay.getCardCVVNo().intValue());
        setTotalAmount(this.safePay.getAmount());
    }
}
