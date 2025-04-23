package assign.ch11.exam02;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try {
            int result = data.length(); // NPE 발생 가능
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally { //무조건 실행
            System.out.println("마무리 실행");
        } 
        // 예외가 예상되는 부분을 try에 넣음
        // 에러를 명시적으로 처리
        // 반드시 처리하려는 코드는 finally에 넣어서 실행을 보장해준다.
     
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null); // null 전달로 인한 NPE 발생
        System.out.println("[프로그램 종료]");
    }
}
