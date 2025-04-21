package type;

public class Arr1 {
    public static void main(String[] args) {
        String[] students;
        students =new String[6];
        
        students[0] = "안은현";
        students[1] = "강병현";
        students[2] = "염다빈";
        students[3] = "이헤원";
        students[4] = "김은지";
        students[5] = "이준범";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
