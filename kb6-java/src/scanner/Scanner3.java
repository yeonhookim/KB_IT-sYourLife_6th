package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요. (종료를 원하시면 exit 입력) :");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("프로그램 종료 합니다");
                break;
            }

            System.out.println("입력한 문자열 : " + input);
        }
    }
}
