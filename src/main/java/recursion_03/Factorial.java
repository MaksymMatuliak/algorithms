package recursion_03;

public class Factorial {
    public static int factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Please, provide number bigger than -1");
        }
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }
}
