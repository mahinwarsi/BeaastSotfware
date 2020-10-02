import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfSquare {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void isThisTheAreaOfSquare(String name){

        System.out.println("Hello " + name + " welcome to Square area.");
        System.out.println("Pls. enter a number:");
        int number9 = getIntAsInput();
        int sub5 = number9 * 4;
        System.out.println("Total area of your square = " + sub5);

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
