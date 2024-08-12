package global.goit.edu;

public class CalculateFibonacciNumbersByIterate implements FibonacciNumbers {

    @Override
    public long calculate(long number) {
        long startTime = System.currentTimeMillis();
        long result = 0;
        long num1 = 0;
        long num2 = 1;
        long num3 = 0;

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        for (int i = 1; i < number; i++) {
            num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
        }
        result = num3;

        return result;
    }
}
