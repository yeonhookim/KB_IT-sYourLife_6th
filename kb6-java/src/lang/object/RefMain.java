package lang.object;

public class RefMain {
    public static void main(String[] args) {
        User2 user1 = new User2("효석");
        User2 user2 = user1;

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);

        user2.setName("준범");
        System.out.println("user2의 이름을 '준범'으로 변경");

        System.out.println("user1: " + user1);
        System.out.println("user2: " + user2);
    }
}