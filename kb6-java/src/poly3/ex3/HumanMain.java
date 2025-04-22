package poly3.ex3;

public class HumanMain {
    public static void main(String[] args) {
        Human one = new Korean();
        Human two = new Spanish();
        Human three = new American();

        one.speak();
        two.speak();
        three.speak();

        one.hello();
        two.hello();
        three.hello();

        one.eat();
        two.eat();
        three.eat();
        

    }
}
