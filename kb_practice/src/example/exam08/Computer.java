package example.exam08;

public class Computer {
    int su(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
            {
                sum += number;
            }
            return sum;
        }
    }
}
