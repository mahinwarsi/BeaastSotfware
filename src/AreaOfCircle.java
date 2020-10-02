import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfCircle {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void calculateAreaOfCircle(String name) {

        System.out.println("Hello " + name + " welcome to circle area.");
        System.out.println("R for calculating the radious of circle and D for calculating the diameter of circle.");
        String circle = getStringAsInput();
        switch (circle) {
            case "R":
                double pie = 3.14;
                System.out.println("Enter the radious length : ");
                int radiouslength = getIntAsInput();
                int sum10 = radiouslength * radiouslength;
                int sum11 = (int) (sum10 * pie);
                System.out.println("The area of your circle = " + sum11);
                break;

            case "D":
                double pie1 = 3.14;
                System.out.println("Enter the diameter length : ");
                int diameterlength = getIntAsInput();
                int sum12 = diameterlength / 2;
                int sum13 = sum12 * sum12;
                int sum14 = (int) (pie1 * sum13);
                System.out.println("The area of your circle = " + sum14);
                break;

            default:
                System.out.println("Sorry wrong choice.");
        }
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
