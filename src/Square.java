import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square {

    public static void calculateArea(String name){

        System.out.println("Hello " + name + " welcome to Square area.");
        System.out.println("Pls. enter a number:");
        int number = UserInput.getIntAsInput();
        int result = number * 4;
        System.out.println("Total area of your square = " + result);

    }
}
