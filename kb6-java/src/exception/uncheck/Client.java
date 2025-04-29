package exception.uncheck;

import exception.check.MyCheckException;

public class Client {
    public void callUncheckException() throws MyCheckException {
        throw new MyUncheckException("Client callUncheckException 에서 발생");
    }
}
