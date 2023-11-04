package Tareas;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator = new Calculator<>(5, 3);
        System.out.println("Addition: " + intCalculator.add());
        System.out.println("Subtraction: " + intCalculator.subtract());
        System.out.println("Multiplication: " + intCalculator.multiply());
        System.out.println("Division: " + intCalculator.divide());

        Calculator<Double> doubleCalculator = new Calculator<>(5.0, 2.5);
        System.out.println("Addition: " + doubleCalculator.add());
        System.out.println("Subtraction: " + doubleCalculator.subtract());
        System.out.println("Multiplication: " + doubleCalculator.multiply());
        System.out.println("Division: " + doubleCalculator.divide());
    }
}