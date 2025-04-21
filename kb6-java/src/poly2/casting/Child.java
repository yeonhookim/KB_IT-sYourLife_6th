package poly2.casting;

public class Child extends Parent {
    public void childMethod() {
        //자식에만 있는 메서드. 오버라이딩 아님
        System.out.println("자식 클래스의 childMethod 입니다.");
    }
}
