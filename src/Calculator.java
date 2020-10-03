import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public void calculate(String name) {
        System.out.println("Hello " + name + " welcome to The Calculator.");
        System.out.println("What would you ike to do.");
        System.out.println("Press + for Addition");
        System.out.println("Press - for Substraction");
        System.out.println("Press * for Multiply");
        System.out.println("Press / for Divide");
        String number = UserInput.getStringAsInput();
        switch (number) {
            case "+":
                add();
                break;
            case "-":
                subtract();
                break;
            case "*":
                multiply();
                break;
            case "/":
                divide();
                break;
            default:
                System.out.println("Sorry you have taken a wrong choice");
        }
    }

    private void divide() {
        System.out.println("Pls. enter your First number");
        int number1 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number2 = UserInput.getIntAsInput();
        int result = number1 / number2;
        System.out.println("Performing Division...Total = " + result);
    }

    private void multiply() {
        System.out.println("Pls. enter your First number");
        int number1 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number2 = UserInput.getIntAsInput();
        int result = number1 * number2;
        System.out.println("Performing Multiplication...Total = " + result);
    }

    private void subtract() {
        System.out.println("Pls. enter your First number");
        int number1 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number2 = UserInput.getIntAsInput();
        int result = number1 - number2;
        System.out.println("Performing Substraction...Total = " + result);
    }

    private void add() {
        System.out.println("Pls. enter your First number");
        int number1 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number2 = UserInput.getIntAsInput();
        int result = number1 + number2;
        System.out.println("Performing Addition...Total = " + result);
    }
}
