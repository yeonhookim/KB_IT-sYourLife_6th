package poly4;

public class NaverPay implements Pay {
    @Override
    public void pay(int amount) {
        System.out.println("Naver Pay 시스템과 연결 합니다.");
        System.out.println(amount + " 원 만큼 결제를 시도 합니다");
        System.out.println("결제 성공");

    }
}
