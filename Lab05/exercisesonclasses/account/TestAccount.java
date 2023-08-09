package exercisesonclasses.account;

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account("A101", "Hoang Tuan Tu", 88);
        System.out.println(account1);
        Account account2 = new Account("A102", "Grizmo");

        System.out.println("Id is: " + account1.getId());
        System.out.println("Name is: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());

        account1.credit(100);
        System.out.println(account1);
        account1.debit(50);
        System.out.println(account1);

        account1.debit(500);
        System.out.println(account1);

        account1.transferTo(account2, 100);
        System.out.println(account1);
        System.out.println(account2);
    }
}
