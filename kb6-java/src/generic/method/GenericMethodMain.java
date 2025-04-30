package generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Integer value = GenericMethod.<Integer>genericMethod(100);
        Integer value2 = GenericMethod.genericMethod(101);
        System.out.println(value);
 }
}
