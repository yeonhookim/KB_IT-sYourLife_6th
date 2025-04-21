package scanner;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("시작 정수를 입력 하세요 : ");
//        int i = scanner.nextInt();
//
//        System.out.print("종료 정수를 입력 하세요 : ");
//        int j = scanner.nextInt();
//
//        if (i > j) {
//            System.out.println("시작 정수가 종료 정수보다 큽니다.");
//            System.exit(0);
//        }
//
//        int sum = 0;
//        for (int k = i; k <= j; k++) {
//            sum += k;
//        }
//
//        System.out.println("시작 수 부터 종료 수 까지의 합은 : " + sum);

        System.out.print("시작 정수를 입력 하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("종료 정수를 입력 하세요 : ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("시작 정수가 종료 정수보다 큽니다.");
            return;
        }
        int sum = 0;
        for (int i = num1; i <= num1; i++) {
            sum += i;
        }
        System.out.println("총 합은 = "+sum);

    }
}
