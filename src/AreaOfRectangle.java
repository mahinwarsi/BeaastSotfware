import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfRectangle {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void isThisTheAreaOfRectangle(String name){

        System.out.println("Hello " + name + " welcome to Rectangle's area.");
        System.out.println("Pls. enter a the length : ");
        int number10 = getIntAsInput();
        System.out.println("Pls. enter a the breadth : ");
        int number11 = getIntAsInput();
        int sub6 = number10 * 2 + number11 * 2;
        System.out.println("Total area of your Rectangle = " + sub6);

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
