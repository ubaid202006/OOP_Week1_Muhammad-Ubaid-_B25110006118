public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private double Result;

    // Null Constructor
    public Calculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.Result = 0;
    }

    // Parameterized constructor
    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.Result = 0;
    }

    // ---------- Getters ----------
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public double getLastResult() {
        return Result;
    }

    // ---------- Setters ----------
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    
    // behaviours

    public double add(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        Result = total;
        return total;
    }

    public double subtract(double first, double second) {
        Result = first - second;
        return Result;
    }

    public double multiply(double... numbers) {
        double product = 1;
        for (double number : numbers) {
            product *= number;
        }
        Result = product;
        return product;
    }
    
    //handles math error exception
    public double divide(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot divide " + first + " by zero.");
        }
        Result = first / second;
        return Result;
    }
    
    public double modulus(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot take modulus of " + first + " by zero.");
        }
        Result = first % second;
        return Result;
    }

    public double power(double base, double exponent) {
        Result = Math.pow(base, exponent);
        return Result;
    }

    public double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot average an empty list of numbers.");
        }
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        Result = total / numbers.length;
        return Result;
    }

    public double maximum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find maximum of an empty list of numbers.");
        }
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        Result = max;
        return max;
    }

    public double minimum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find minimum of an empty list of numbers.");
        }
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        Result = min;
        return min;
    }

    // ---------- Display ----------

    public void displayState() {
        System.out.println("---- Calculator ----");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);
        System.out.println("Result   : " + Result);
        System.out.println();
    }
}
