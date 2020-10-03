import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {

    static void makePyramid(String name) {
        System.out.println("Hello " + name + " welcome to The pyramid's.");
        System.out.println("H for half pyramid and V for vertical pyramid");
        String pyramidChoice = UserInput.getStringAsInput();
        switch (pyramidChoice) {
            case "H":
                halfPyramid();
                break;
            case "V":
                verticalPyramid();
                break;

            default:
                System.out.println("You have chosen wrong choice");
        }
    }

    private static void verticalPyramid() {
        System.out.println("Pls. enter your number : ");
        int number1 = UserInput.getIntAsInput();
        for (int a = 1; a <= number1; ++a) {
            for (int m = 1; m <= a; ++m) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int sum15 = number1 - 1;
        for (int i = sum15; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void halfPyramid() {
        System.out.println("Pls. enter your number :");
        int number2 = UserInput.getIntAsInput();
        for (int i = 1; i <= number2; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
