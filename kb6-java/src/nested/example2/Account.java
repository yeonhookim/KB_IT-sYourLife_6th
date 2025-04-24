package nested.example2;

import nested.example.Transaction;

import java.time.LocalDateTime;

public class Account {
    static private int count = 0;
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;

        count++;
        StaticAccountStatus.lastOpener = owner;
        InnerAccountStatus.lastOpener = owner;
    }

    public static class StaticAccountStatus {
        static private String lastOpener;

        public static void showStaus() {
            System.out.println("현재 해당 상품은 총 " + count + " 만큼 개설 되었습니다.");
            System.out.println("마지막으로 개설한 사람은 " + lastOpener + " 입니다");
        }
    }

    public void showInnerStatus() {
        InnerAccountStatus inner = new InnerAccountStatus();
        inner.showStaus();
    }

    private class InnerAccountStatus {
        static private String lastOpener;

        private void showStaus() {
            System.out.println("현재 해당 상품은 총 " + count + " 만큼 개설 되었습니다.");
            System.out.println("마지막으로 개설한 사람은 " + lastOpener + " 입니다");
            System.out.println("해당 계좌 소유주는 " + owner + " 이고, 잔고는 " + balance + " 입니다");
        }
    }

    private class Transaction {
        private String type;
        private int amount;
        private LocalDateTime timestamp;

        public Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
            this.timestamp = LocalDateTime.now();
        }

        public void print() {
            System.out.println("[" + timestamp + "] " + type + " - 금액: " + amount + "원, 잔액: " + balance + "원");
        }
    }

    public void deposit(int amount) {
        balance += amount;
        Transaction transaction = new Transaction("입금", amount);
        transaction.print();
    }

    public void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
            return;
        }

        balance -= amount;
        Transaction transaction = new Transaction("출금", amount);
        transaction.print();
    }
}