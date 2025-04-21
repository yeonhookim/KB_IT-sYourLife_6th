package example.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean koko = new Korean("대한민국", "박자바", "011225-1234567");

        //또 다른 Korean 객체 생성
        Korean koko2 = new Korean("대한민국", "김자바", "930525-0654321");

        System.out.println(koko.nation);
        System.out.println(koko.name);
        System.out.println(koko.ssn);
        System.out.println("");
        System.out.println(koko2.nation);
        System.out.println(koko2.name);
        System.out.println(koko2.ssn);
    }
}
