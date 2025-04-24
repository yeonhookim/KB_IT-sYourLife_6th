package nested.anonymous.dice;

import java.util.Random;

public class ComplicatedMain2 {
    public static void complicatedProgram(Dice dice) {
        System.out.println("프로그램 시작 작업");
        
        dice.run();
        
        System.out.println("프로그램 종료 작업");
    }


        public static void main(String[] args) {
            class DiceProgram implements Dice {
                @Override
                public void run() {
                    int rand = new Random().nextInt(6) + 1;
                    System.out.println("주사위의 값은 " + rand);
                }
        }
            complicatedProgram((new DiceProgram()));
    }
}

// 지역 클래스 활용