package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("은행 잔고는 : " + account.getBalance());
    }
}
