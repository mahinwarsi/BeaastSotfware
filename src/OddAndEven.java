import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddAndEven {

    public static void isOddOrEven(String name){
        System.out.println("Hello " + name + " welcome to odd and even.");
        System.out.println("Pls. enter a number : ");
        int number = UserInput.getIntAsInput();
        if (number % 2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");
    }
}
