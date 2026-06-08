class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 10);
        System.out.println("Sum: " + result);
    }
}