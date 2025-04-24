package nested.inner;

public class InnerOuter {
    private static String outerStatic = "outerStatic";
    private String outerInstance = "outerInstance";

     class Inner {
        private static String nestedStatic = "nestedStatic";
        private String nestedInstance = "nestedInstance";

        public void print() { //헬퍼 메서드
            //클래스 내부의 static값에 접근
            System.out.println("innerStatic = " + nestedStatic);
            System.out.println("outerStatic = " + outerStatic);

            //클래스 내부의 non-static값에 접근
            System.out.println("innerInstance = " + nestedInstance);
            System.out.println("outerStatic = " + outerInstance);
        }

    }}