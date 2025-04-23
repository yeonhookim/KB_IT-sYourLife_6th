package lang.wrapper;

public class CompareMain {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;

        Integer a = Integer.valueOf(1);
        Integer b = Integer.valueOf(2);

        System.out.println(a.compareTo(b));

        Integer integer1 = 10;
        Integer integer2 = Integer.valueOf(10);

        Long long1 = 100L;
        long long2 = Long.valueOf(100L);

        int intValue1 = integer1.intValue();
        int intValue2 = integer2.intValue();

        long longValue1 = long1.longValue();
        long longValue2 = long2;


    }
}
