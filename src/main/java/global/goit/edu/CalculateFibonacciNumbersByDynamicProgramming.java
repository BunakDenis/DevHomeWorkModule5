package global.goit.edu;

import java.util.HashMap;
import java.util.Map;

public class CalculateFibonacciNumbersByDynamicProgramming implements FibonacciNumbers {

    private static final Map<Long, Long> memo = new HashMap<>();

    @Override
    public long calculate(long number) {
        long result;

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        result = calculate(number - 2) + calculate(number - 1);
        memo.put(number, result);

        return result;
    }
}