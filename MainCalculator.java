public class MainCalculator{
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        calc.displayState();
        
        calc.setFirstNumber(20);
        calc.setSecondNumber(4);
        System.out.println("After setters -> first: " + calc.getFirstNumber()
                + ", second: " + calc.getSecondNumber());

        System.out.println("\n===== add() =====");
        System.out.println("Normal case (2, 3, 5): " + calc.add(2, 3, 5));
        System.out.println("Edge case (single number, 7): " + calc.add(7));

        System.out.println("\n===== subtract() =====");
        System.out.println("Normal case (10 - 4): " + calc.subtract(10, 4));            // 6
        System.out.println("Edge case (0 - 5, goes negative): " + calc.subtract(0, 5)); // -5

        System.out.println("\n===== multiply() =====");
        System.out.println("Normal case (2, 3, 4): " + calc.multiply(2, 3, 4));      // 24
        System.out.println("Edge case (includes a zero): " + calc.multiply(5, 0, 9)); // 0

        System.out.println("\n===== divide() =====");
        System.out.println("Normal case (20 / 4): " + calc.divide(20, 4)); // 5
        try {
            calc.divide(9, 0);
        } catch (ArithmeticException e) {
            System.out.println("Edge case (divide by zero) handled: " + e.getMessage());
        }

        System.out.println("\n===== modulus() (new) =====");
        System.out.println("Normal case (10 % 3): " + calc.modulus(10, 3)); // 1
        try {
            calc.modulus(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Edge case (modulus by zero) handled: " + e.getMessage());
        }

        System.out.println("\n===== power() (new) =====");
        System.out.println("Normal case (2 ^ 5): " + calc.power(2, 5));        // 32
        System.out.println("Edge case (any number ^ 0): " + calc.power(9, 0)); // 1

        System.out.println("\n===== average() (new) =====");
        System.out.println("Normal case (4, 8, 12): " + calc.average(4, 8, 12)); // 8
        try {
            calc.average(); // no numbers passed at all
        } catch (IllegalArgumentException e) {
            System.out.println("Edge case (empty input) handled: " + e.getMessage());
        }

        System.out.println("\n===== maximum() (new) =====");
        System.out.println("Normal case (3, 9, 1, 7): " + calc.maximum(3, 9, 1, 7));       // 9
        System.out.println("Edge case (all same value, 5,5,5): " + calc.maximum(5, 5, 5)); // 5

        System.out.println("\n===== minimum() (new) =====");
        System.out.println("Normal case (3, 9, 1, 7): " + calc.minimum(3, 9, 1, 7));       // 1
        System.out.println("Edge case (single negative number, -4): " + calc.minimum(-4)); // -4

        // getLastResult() via getter
        System.out.println("\nFinal lastResult via getter: " + calc.getLastResult());
        calc.displayState();
    }
}
