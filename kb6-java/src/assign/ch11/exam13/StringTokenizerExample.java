package assign.ch11.exam13;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr1 = data1.split("&|,");

        for (String token : arr1) {
            System.out.println(token);
        }

        String data2 = "홍길동/이수홍/박연수";
        String[] arr2 = data2.split("/");
        for (String token : arr2) {
            System.out.println(token);
        }
    }
}
