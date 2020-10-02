import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NegAndPos {

    public static void isThisNegOrPos(String name){
        System.out.println("Hello " + name + " welcome to negitive and possitive.");
        System.out.println("Pls. enter a number : ");
        int number19 = UserInput.getIntAsInput();
        if (number19 > 0) ;
        System.out.println("Your number is possitive : ");
        if (number19 < 0) ;
        System.out.println("Your number is negitive");
    }
}
