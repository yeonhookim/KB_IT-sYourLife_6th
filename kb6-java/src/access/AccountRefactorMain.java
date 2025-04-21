package access;

public class AccountRefactorMain {
    public static void main(String[] args) {
        AccountRefactor account = new AccountRefactor("국민은행", "silver", "이효석", 1000);

        // public 필드 접근
        System.out.println("public 접근제어자 확인");
        System.out.println("은행명은 ? " + account.bank);

        // default 필드 접근
        System.out.println("default 접근제어자 확인");
        System.out.println("등급은 ? " + account.grade);

        // private 필드 접근
//        System.out.println("private 접근제어자 확인");
//        System.out.println("이름은 ? " + account.name);
//        System.out.println("잔고는 ? " + account.total);
    }
}
