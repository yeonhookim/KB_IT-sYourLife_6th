package poly2.casting;

public class CastingMethod {
    public static void main(String[] args) {
        Child child = new Child();

        child.childMethod();
        child.parentMethod();

        Parent parent = new Child();
        parent.parentMethod();
//        poly.childMethod(); 오류뜸

        Child poly = (Child) parent;
        poly.childMethod();

//        (Child) parent.childMethod(); 이러면 오류
        ((Child) parent).childMethod(); //이렇게 소괄호로 한 번 더 해서

    }
}
