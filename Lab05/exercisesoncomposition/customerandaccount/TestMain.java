package exercisesoncomposition.customerandaccount;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(2610, "Grizmo",'m');
        System.out.println("Customer: " + customer1);

        Account account1 = new Account(2003, customer1, 10000000);
        System.out.println("Account: " + account1);
        account1.deposit(100000);
        System.out.println("Account after deposit: " + account1);

        account1.withdraw(100000);
        System.out.println("Account after withdraw: " + account1);


    }
}
