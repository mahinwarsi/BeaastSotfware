import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfTriangle {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void calculateTriangle(String name){

        System.out.println("Hello " + name + " welcome to triangle area.");
        System.out.println("E for Equilateral Triangle, I for Isosceles Triangle and S for Scalene Triangle : ");
        String trianglre = getStringAsInput();
        switch (trianglre) {
            case "E":
                System.out.println("Pls. enter the length : ");
                int number12 = getIntAsInput();
                int sum7 = number12 * 3;
                System.out.println("Total area of your triangle = " + sum7);
                break;

            case "I":
                System.out.println("Pls. enter the length of first line : ");
                int number13 = getIntAsInput();
                System.out.println("Enter the length of third line : ");
                int number14 = getIntAsInput();
                int sum8 = number13 * 2 + number14;
                System.out.println("Total area of your triangle = " + sum8);
                break;
            case "S":
                System.out.println("Pls. enter the length of first line : ");
                int number15 = getIntAsInput();
                System.out.println("Enter the length of second line : ");
                int number16 = getIntAsInput();
                System.out.println("Enter the length of third line : ");
                int number17 = getIntAsInput();
                int sub9 = number15 + number16 + number17;
                System.out.println("Total area of your triangle = " + sub9);
                break;
            default:
                System.out.println("You have taken a wrong choice.");
        }
        System.out.println("Do you want to leave.");
        System.out.println("Yes or no : ");
        String yesNo = getStringAsInput();

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
