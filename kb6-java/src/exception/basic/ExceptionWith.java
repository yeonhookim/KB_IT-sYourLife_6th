package exception.basic;

public class ExceptionWith {
    public static void main(String[] args) {

      try {
          int[] arr = {1, 2, 3, 4, 5};
          accessArr(arr, 5);
          Object obj = null;
          accessNull(obj);
      } catch (Exception e) {
          e.printStackTrace();
      }
    }

    public static boolean accessArr(int[] arr, int idx) {
        return idx < arr.length;
    }

    public static boolean accessNull(Object obj) {
        return obj == null;
    }
}
