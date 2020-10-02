import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public void calculate(String name) {
        System.out.println("Hello " + name + " welcome to The Calculator.");
        System.out.println("What would you ike to do.");
        System.out.println("+ for Addition");
        System.out.println("- for Substraction");
        System.out.println("* for Multiply");
        System.out.println("/ for Divide");
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
        int number7 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number8 = UserInput.getIntAsInput();
        int sum4 = number7 / number8;
        System.out.println("Performing Division...Total = " + sum4);
    }

    private void multiply() {
        System.out.println("Pls. enter your First number");
        int number5 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number6 = UserInput.getIntAsInput();
        int result = number5 * number6;
        System.out.println("Performing Multiplication...Total = " + result);
    }

    private void subtract() {
        System.out.println("Pls. enter your First number");
        int number3 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number4 = UserInput.getIntAsInput();
        int sum2 = number3 - number4;
        System.out.println("Performing Substraction...Total = " + sum2);
    }

    private void add() {
        System.out.println("Pls. enter your First number");
        int number1 = UserInput.getIntAsInput();
        System.out.println("Pls. enter your Second number");
        int number2 = UserInput.getIntAsInput();
        int sum1 = number1 + number2;
        System.out.println("Performing Addition...Total = " + sum1);
    }
}
