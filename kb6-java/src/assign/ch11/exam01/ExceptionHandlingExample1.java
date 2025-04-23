package assign.ch11.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length(); // NPE 발생 가능
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null 전달로 인한 NPE 발생
        System.out.println("[프로그램 종료]");
    }
}
