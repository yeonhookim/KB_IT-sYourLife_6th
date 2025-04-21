package example.exam05;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {
    }

    public Car(String model) {
        this.(model, "오렌지", 999999999)
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
