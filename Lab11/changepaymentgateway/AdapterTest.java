package changepaymentgateway;
/*
Here is an adapter that can stand between the code
and the vendor API and can allow the process to flow
 */

public class AdapterTest {
    public static void main(String[] args) {
        SafePay safePay = new SafePayImpl();
        safePay.setCreditCardNo("01021012345");
        safePay.setCustomerName("Taylor Swift");
        safePay.setCardExpMonth("01");
        safePay.setCardExpYear("25");
        safePay.setCardCVVNo((short) 123);
        safePay.setAmount(1000.01);

        SmartPay smartPay = new SafePayToSmartPayAdapter(safePay);
        testSmartPay(smartPay);
    }

    private static void testSmartPay (SmartPay smartPay){
        System.out.println(smartPay.getCardOwnerName());
        System.out.println(smartPay.getCustomerCardNo());
        System.out.println(smartPay.getCardExpMonthYear());
        System.out.println(smartPay.getCVVNo());
        System.out.println(smartPay.getTotalAmount());
    }
}
