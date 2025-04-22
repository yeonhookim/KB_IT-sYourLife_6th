package poly5;

import java.util.Scanner;

public class K5Car implements Car {

    int efficiency = 2;
    int fuel;

    @Override
    public void openDoor() {
        System.out.println("K5 차 문을 엽니다");
    }
    @Override
    public void fillFuel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주유할 기름의 양을 입력 하세요 : ");
        this.fuel = sc.nextInt(); // 사용자에게 입력받기
    }
    @Override
    public void drive() {
        fillFuel();
        openDoor();
        System.out.println("K5가 주행을 시작 합니다");
        int distance = efficiency * fuel;
        System.out.println("K5는 총 " + distance + "만큼 달렸습니다");
        System.out.println("K5 주행 종료");
    }
}

