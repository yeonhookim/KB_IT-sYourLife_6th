package exception.real;

import exception.check.MyCheckException;
import exception.real.exceptions.MyUncheckException;

public class Client {
    public void callException() throws MyCheckException {
        throw new MyCheckException("callExeption 에서 발생");
    }

    public void callException2() {
        throw new MyUncheckException("callException 에서 발생");
    }
}
