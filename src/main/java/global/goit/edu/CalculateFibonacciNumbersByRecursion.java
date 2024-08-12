package global.goit.edu;

public class CalculateFibonacciNumbersByRecursion implements FibonacciNumbers {

    @Override
    public long calculate(long number) {
        long result = 0;

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        if (number > 0) {
            result = calculate(number - 1) + calculate(number - 2);
        }

        return result;

    }
}
