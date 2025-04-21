package scanner;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = (int)(Math.random() * 101);  // 0~100 포함

        while (true) {
            System.out.print("숫자를 입력해주세요: ");
            int input = scanner.nextInt();

            if (input == answer) {
                System.out.println("정답입니다! 🎉 숫자: " + answer);
                break;
            } else if (input < answer) {
                System.out.println("Up");
            } else {
                System.out.println("Down");
            }
        }

        scanner.close();
    }
}
