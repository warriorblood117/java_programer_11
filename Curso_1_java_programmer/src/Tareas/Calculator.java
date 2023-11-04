package Tareas;

public class Calculator<T extends Number> {
    private T operand1;
    private T operand2;

    public Calculator(T operand1, T operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public T add() {
        if (operand1 instanceof Integer) {
            return (T) (Integer) (operand1.intValue() + operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) (Double) (operand1.doubleValue() + operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) (Float) (operand1.floatValue() + operand2.floatValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T subtract() {
        if (operand1 instanceof Integer) {
            return (T) (Integer) (operand1.intValue() - operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) (Double) (operand1.doubleValue() - operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) (Float) (operand1.floatValue() - operand2.floatValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T multiply() {
        if (operand1 instanceof Integer) {
            return (T) (Integer) (operand1.intValue() * operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) (Double) (operand1.doubleValue() * operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) (Float) (operand1.floatValue() * operand2.floatValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }

    public T divide() {
        if (operand2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        if (operand1 instanceof Integer) {
            return (T) (Integer) (operand1.intValue() / operand2.intValue());
        } else if (operand1 instanceof Double) {
            return (T) (Double) (operand1.doubleValue() / operand2.doubleValue());
        } else if (operand1 instanceof Float) {
            return (T) (Float) (operand1.floatValue() / operand2.floatValue());
        } else {
            throw new IllegalArgumentException("Unsupported numeric type");
        }
    }
}


