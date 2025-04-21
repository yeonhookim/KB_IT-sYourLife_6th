package poly2.casting;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
//        Parent parent1 = child; // 부모는 자식을 담을 수 있다
//        Parent parent2 = (Parent) child; //위 아래가 동일함 문제 없음

        // 1번 코드
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        // 2번 코드
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();

    }
}
