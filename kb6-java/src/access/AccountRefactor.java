package access;

public class AccountRefactor {
    public String bank; // 은행 명
    String grade;   // 회원 등급
    private String name;    // 계좌 소유주
    private int total;  // 은행 잔고

    AccountRefactor(String bank, String grade, String name, int init) {
        this.total = init;
        this.bank = bank;
        this.grade = grade;
        this.name = name;
    }
    void deposit(int amount) {
        this.total += amount;
    }
    void withdraw(int amount) {
        this.total -= amount;
    }
}
