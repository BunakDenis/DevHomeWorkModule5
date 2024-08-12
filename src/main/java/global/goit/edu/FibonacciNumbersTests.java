package global.goit.edu;

public class FibonacciNumbersTests {

    public static void main(String[] args) {
        /*Часова та просторова складність обчислення числа Фібоначчі:
            - ітераційний метод : часова складність - О(n), просторова складність - О(1)
            - рекурсивний метод : часова складність - О(2^n), просторова складність - О(2^n)
            - метод динамічного програмування : часова складність - О(2^n), просторова складність - О(n)
        */
        FibonacciNumbers iterate = new CalculateFibonacciNumbersByIterate();
        FibonacciNumbers recursion = new CalculateFibonacciNumbersByRecursion();
        FibonacciNumbers dynamicProgramming = new CalculateFibonacciNumbersByDynamicProgramming();

        for (int i = 0; i <= 10; i++) {
            System.out.println("iterate.calculate " + i + " = " + iterate.calculate(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("recursion.calculate " + i + " = " + recursion.calculate(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("DynamicProgramming.calculate " + i + " = " + dynamicProgramming.calculate(i));
        }
    }
}