import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pyramid {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static void pyramid(String name) {
        System.out.println("Hello " + name + " welcome to The pyramid's.");
        System.out.println("H for half pyramid and V for vertical pyramid");
        String pyramidchoice = getStringAsInput();
        switch (pyramidchoice) {
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
        int number21 = getIntAsInput();
        for (int a = 1; a <= number21; ++a) {
            for (int m = 1; m <= a; ++m) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int sum15 = number21 - 1;
        for (int i = sum15; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void halfPyramid() {
        System.out.println("Pls. enter your number :");
        int number20 = getIntAsInput();
        for (int i = 1; i <= number20; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
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
