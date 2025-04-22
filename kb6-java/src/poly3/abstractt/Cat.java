package poly3.abstractt;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("고양이는 야옹");
    }

    @Override
    public void eat() {
        System.out.println("고양이가 밥을 먹는다");
    }
}
