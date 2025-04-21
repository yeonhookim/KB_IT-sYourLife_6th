package access;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(1000);

        account.deposit(10000); // 용돈
        account.withdraw(5000); // 학식

        account.total = 500000000;

        System.out.println("님은 금액은 : " + account.total);
    }
}
