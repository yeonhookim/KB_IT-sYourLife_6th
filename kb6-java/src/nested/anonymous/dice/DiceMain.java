package nested.anonymous.dice;

import java.util.Random;

public class DiceMain {
    public static void hellodice() {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        int rand = new Random().nextInt(6) + 1;
        System.out.println("주사위의 값은 " + rand);
        // 코드 조각 종료
    }

    public static void main(String[] args) {
        hellodice();
    }
}
