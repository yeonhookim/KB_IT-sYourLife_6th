package assign.ch11.exam10;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); //변수가 생성되는 시간을 나노로 담음
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime(); //끝나는 시간
        System.out.println("합산 결과는 : " + sum);
        long time = endTime - startTime;
        System.out.println("계산에 걸린 시간은 : " + time);

    }
}
