package poly3.multiple;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다.");
    }
    @Override
    public void sleep() {
        System.out.println("강아지가 꿀잠을 잡니다.");
    }

}
