package exception.check;

public class Client {
    public void callCheckException(boolean check) throws MyCheckException2 {
        if (check) {
            throw new MyCheckException2("오늘은 운이 없으시군요");
        }
        System.out.println("오늘은 운이 좋으시군요");
    }
}
