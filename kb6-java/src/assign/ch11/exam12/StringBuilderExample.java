package assign.ch11.exam12;

public class StringBuilderExample {
    public static void main(String[] args) {
        String str = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString(); //문자열로, 입력 시 빨간 줄 사라짐
        System.out.println(str);
    }
}
