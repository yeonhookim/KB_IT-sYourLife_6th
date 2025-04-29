package exception.uncheck;

import exception.check.MyCheckException;

public class Service {
    public static void main(String[] args) {
        try {
            Client client = new Client();
            client.callUncheckException();
        } catch (MyUncheckException e) {
            e.printStackTrace();
        } catch (MyCheckException e) {
            throw new RuntimeException(e);
        }
        System.out.println("막았는가?");
    }
}
