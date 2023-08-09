package exercisesonclasses.account;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if (amount > balance)
            System.out.println("Amount exceeded balance");
        else
            balance -= amount;
        return balance;
    }
    public int transferTo(Account another, int amount){
        if (amount > balance)
            System.out.println("Amount exceeded balance");
        else {
            balance -= amount;
            another.setBalance(another.getBalance() + amount);
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
