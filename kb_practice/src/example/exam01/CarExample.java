package example.exam01;

public class CarExample {
    public static void main(String[] args) {
        
        Car myCar = new Car("그랜저", "검정", 250);
        //Car myCar = new Car(); //기본 생성자 호출 못 함

        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.max_speed);
    }
}
