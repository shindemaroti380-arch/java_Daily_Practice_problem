public class FactorialNumber {
    public static void main(String[] args) {

        int n = 5;
        int factorial = 1;

        // Calculate factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);
    }
}
