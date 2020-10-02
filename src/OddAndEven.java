import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddAndEven {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void isOddOrEven(String name){
        System.out.println("Hello " + name + " welcome to odd and even.");
        System.out.println("Pls. enter a number : ");
        int number18 = getIntAsInput();
        if (number18 % 2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");
    }
    private static String getStringAsInput() {
        String data = null;

        try {
            data = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static int getIntAsInput() {
        return Integer.parseInt(getStringAsInput());
    }
}
