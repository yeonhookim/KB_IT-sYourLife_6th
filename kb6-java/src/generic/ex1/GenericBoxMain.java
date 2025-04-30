package generic.ex1;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.setValue(1);
        System.out.println(integerBox.getValue());

        GenericBox<String> stringBox = new GenericBox<String>(); //뒤에 생략 가능
        stringBox.setValue("내일 쉰다~ 오예");
        System.out.println(stringBox.getValue());
    }
}
