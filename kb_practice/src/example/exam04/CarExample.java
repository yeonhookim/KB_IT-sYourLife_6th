package example.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("자가용");
        Car car3 = new Car("자가용","빨강");
        Car car4 = new Car("택시","검정",250);

        System.out.println(car1.company);

        System.out.println(car2.company);
        System.out.println(car2.model);

        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);

        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
    }
}
