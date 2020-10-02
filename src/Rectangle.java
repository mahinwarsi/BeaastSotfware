import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangle {

    public static void calculateArea(String name){

        System.out.println("Hello " + name + " welcome to Rectangle's area.");
        System.out.println("Pls. enter a the length : ");
        int number10 = UserInput.getIntAsInput();
        System.out.println("Pls. enter a the breadth : ");
        int number11 = UserInput.getIntAsInput();
        int sub6 = number10 * 2 + number11 * 2;
        System.out.println("Total area of your Rectangle = " + sub6);

    }
}
