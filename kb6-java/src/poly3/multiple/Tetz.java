package poly3.multiple;

public class Tetz implements Animal, Human {
    @Override
    public void eat() {
        System.out.println("테츠가 밥처럼 콜라를 마십니다!");
    }

    @Override
    public void sleep() {
        System.out.println("테츠가 늙어서 잠을 잘 못잡니다!");

    }

    @Override
    public void think() {
        System.out.println("수업에서 어떻게 하면 더 웃길지 고민합니다");

    }
}
