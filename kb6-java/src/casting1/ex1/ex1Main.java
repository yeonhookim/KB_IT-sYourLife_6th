package casting1.ex1;

public class ex1Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.eat();
        cat.eat();
        ((Dog) dog).sound();
        ((Cat) cat).sound();

//        Cat catSound = (Cat) cat;
//        catSound.sound();
//
//        Dog dogSound = (Dog) dog;
//        dogSound.sound();
    }
}