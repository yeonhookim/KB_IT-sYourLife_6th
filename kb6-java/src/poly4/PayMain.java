package poly4;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        PaySystem paySystem = new PaySystem();

        paySystem.selectPay();
        paySystem.selectAmount();
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        int option;
//        int amount;
//
//        System.out.print("결제 옵션을 입력 하세요 (1. KB / 2. Kakao / 3. Naver): ");
//        option = scanner.nextInt();
//
//        System.out.println("결제 금액을 입력하세요 :");
//        amount = scanner.nextInt();
//
//        if (option == 1) {
//            paySystem.setPay(new KBPay());
//        } else if (option == 2) {
//            paySystem.setPay(new KakaoPay());
//        } else if (option == 3) {
//            paySystem.setPay(new NaverPay());
//        } else {
//            System.out.println("1~3번 중에 입력해주세요.");
//        }
//
//        paySystem.payment(amount);
    }
}
