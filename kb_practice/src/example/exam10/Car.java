package example.exam10;

public class Car {
    String model;
    int speed;

    public Car(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        System.out.println(this.model + "이 달립니다. (시속 : " + this.speed + ")"
        );
    }
}
