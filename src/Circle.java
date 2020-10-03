import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

    public static void calculateArea(String name) {

        System.out.println("Hello " + name + " welcome to circle area.");
        System.out.println("R for calculating the radious of circle and D for calculating the diameter of circle.");
        String circle = UserInput.getStringAsInput();
        switch (circle) {
            case "R":
                double pie = 3.14;
                System.out.println("Enter the radious length : ");
                int radiouslength = UserInput.getIntAsInput();
                int sum1 = radiouslength * radiouslength;
                int sum2 = (int) (sum1 * pie);
                System.out.println("The area of your circle = " + sum2);
                break;

            case "D":
                double pie1 = 3.14;
                System.out.println("Enter the diameter length : ");
                int diameterlength = UserInput.getIntAsInput();
                int sum3 = diameterlength / 2;
                int sum4 = sum3 * sum3;
                int sum5 = (int) (pie1 * sum4);
                System.out.println("The area of your circle = " + sum5);
                break;

            default:
                System.out.println("Sorry wrong choice.");
        }
    }
}
