package memory.inheritance;

public class HydrogenCar  extends Car {
    @Override
    public void move() {
        System.out.println("수소차가 이동합니다");
    }
    @Override
    public void openDoor() {
        System.out.println("수소차 문을 엽니다");
    }
    void fillHydrogen() {
        System.out.println("수소를 충전 삐리빠리뽀");
    }
}
