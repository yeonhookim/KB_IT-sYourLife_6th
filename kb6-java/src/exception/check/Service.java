package exception.check;

import java.util.Random;

public class Service {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            Random rand = new Random();
            boolean b = rand.nextBoolean();
            client.callCheckException(b);
        } catch (MyCheckException2 e) {
            e.printStackTrace();
        }
    }
}