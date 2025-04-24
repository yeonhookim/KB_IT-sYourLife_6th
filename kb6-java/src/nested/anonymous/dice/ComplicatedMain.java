package nested.anonymous.dice;

import java.util.Random;

public class ComplicatedMain {
    public static void complicatedProgram(Dice dice) {
        System.out.println("프로그램 시작 작업");
        
        dice.run();
        
        System.out.println("프로그램 종료 작업");
    }
    static class DiceProgram implements Dice {
        @Override
        public void run() {
            int rand = new Random().nextInt(6) + 1;
            System.out.println("주사위의 값은 " + rand);
        }
        public static void main(String[] args) {
            complicatedProgram((new DiceProgram()));
        }
    }

}
//중첩클래스 스태틱이 붙은 내부 클래스

