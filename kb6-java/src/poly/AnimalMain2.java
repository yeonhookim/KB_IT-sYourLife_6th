package poly;

public class AnimalMain2 {
    public static void main(String[] args) {
        Animal[] animals = {new Donkey(), new Dog(), new Cat(), new Chicken()};
      //배열로도 처리가 되는구나

        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }
    static void soundAnimal(Animal animal) {
        animal.sound();

    }
}
