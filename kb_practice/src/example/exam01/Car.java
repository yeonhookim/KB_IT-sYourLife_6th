package example.exam01;

public class Car {
    //필드 선언
    String model; //null
    boolean start; //false
    int spped; //0


    String color;
    int max_speed;

    public Car(String model, String color, int max_speed) {
        this.model = model;
        this.color = color;
        this.max_speed = max_speed;
    }
}
