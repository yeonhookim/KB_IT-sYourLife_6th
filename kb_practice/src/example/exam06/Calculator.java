package example.exam06;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    int plus(int a, int b) {
        return a + b;
    }
    double divide(int a, int b) {
        return (double)a / b; //명시적 형변환
    }
}
