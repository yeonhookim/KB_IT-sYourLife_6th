package poly4;

import java.util.Scanner;

public class PaySystem {
    Pay pay;
    Scanner scanner = new Scanner(System.in);
    static final int KB_PAY = 1;
    static final int KAKAO_PAY = 2;
    static final int NAVER_PAY = 3;

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void selectPay() {
        System.out.print("결제 옵션을 입력 하세요 (1. KB / 2. Kakao / 3. Naver): ");
        int option = scanner.nextInt();

        if (option == KB_PAY) {
            this.setPay(new KBPay());
        } else if (option == KAKAO_PAY) {
            this.setPay(new KakaoPay());
        } else if (option == NAVER_PAY) {
            this.setPay(new NaverPay());
        }
        }

        public void selectAmount() {
            System.out.println("결제 금액을 입력 하세요 : ");
            int amount = scanner.nextInt();
            payment(amount);
    }

    public void payment(int amount) {
        System.out.println("결제를 시작합니다.");
        pay.pay(amount);
    }
}
