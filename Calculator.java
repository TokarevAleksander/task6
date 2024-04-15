public class Calculator {
    private double num1;
    private double num2;

    public Calculator() {

    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return num1 / num2;
    }

    public double calculate(char operation) throws ArithmeticException {
        switch (operation) {
            case '+':
                return add();
            case '-':
                return subtract();
            case '*':
                return multiply();
            case '/':
                return divide();
            default:
                throw new ArithmeticException("Неправильная операция!");
        }
    }
}
