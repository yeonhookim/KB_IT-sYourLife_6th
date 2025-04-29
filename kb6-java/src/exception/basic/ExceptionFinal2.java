package exception.basic;

public class ExceptionFinal2 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[5]);
            try {
                accessArr(arr, 5);
                Object obj = null;
                accessNull(obj);

                obj.equals(arr);// NPE예외가 발생하는 코드
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("정말 실행하고 싶은 프로그램");
            }
        }

        public static boolean accessArr(int[] arr, int idx) {
            return idx < arr.length;
        }

        public static boolean accessNull(Object obj) {
            return obj == null;
        }
    }
