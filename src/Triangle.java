import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

    public static void calculateArea(String name){

        System.out.println("Hello " + name + " welcome to triangle area.");
        System.out.println("E for Equilateral Triangle, I for Isosceles Triangle and S for Scalene Triangle : ");
        String trianglre = UserInput.getStringAsInput();
        switch (trianglre) {
            case "E":
                System.out.println("Pls. enter the length : ");
                int number = UserInput.getIntAsInput();
                int result = number * 3;
                System.out.println("Total area of your triangle = " + result);
                break;

            case "I":
                System.out.println("Pls. enter the length of first line : ");
                int number1 = UserInput.getIntAsInput();
                System.out.println("Enter the length of third line : ");
                int number2 = UserInput.getIntAsInput();
                int result1 = number1 * 2 + number2;
                System.out.println("Total area of your triangle = " + result1);
                break;
            case "S":
                System.out.println("Pls. enter the length of first line : ");
                int number3 = UserInput.getIntAsInput();
                System.out.println("Enter the length of second line : ");
                int number4 = UserInput.getIntAsInput();
                System.out.println("Enter the length of third line : ");
                int number5 = UserInput.getIntAsInput();
                int result2 = number3 + number4 + number5;
                System.out.println("Total area of your triangle = " + result2);
                break;
            default:
                System.out.println("You have taken a wrong choice.");
        }
    }
}
