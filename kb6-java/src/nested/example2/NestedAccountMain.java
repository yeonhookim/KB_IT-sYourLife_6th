package nested.example2;

public class NestedAccountMain {
    public static void main(String[] args) {
        Account account = new Account("이효석", 1000);
        Account account2 = new Account("채수정", 100000000);

        Account.StaticAccountStatus.showStaus();

//        Account.InnerAccountStatus inner = account2.new InnerAccountStatus();
//        inner.showStaus();

        account2.showInnerStatus();
    }
}