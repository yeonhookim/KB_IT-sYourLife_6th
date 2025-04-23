package assign.ch11.exam11;

import java.util.Properties;

public class GetPropertyExample {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println(os);
        System.out.println(userName);
        System.out.println(userHome);

        Properties props = System.getProperties(); //전체 객체를 가져옴
        System.out.println(props);
    }
}
