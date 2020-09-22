import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class BeastSoftware {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static String name;
    private static int pie;

    public static void main(String[] args) {
        System.out.println("Hello my name is Mahin.");
        System.out.println("What is your name : ");
        name = getStringAsInput();

        System.out.println("Hello " + name + " welcome to Beast Software.");
        if ("Mahin".equalsIgnoreCase(name))
            System.out.println("Wow our name matche's.");
        System.out.println("Let's create your password.");

        int correctPasswordEntered = 0;
        do {
            System.out.println("Pls. enter your password here : ");
            String password1 = getStringAsInput();
            System.out.println("Pls. re-enter your password : ");
            String password2 = getStringAsInput();
            if (password1.equals(password2)) {
                correctPasswordEntered = 1;
                System.out.println("Password matched..");
            } else {
                System.out.println("Your password did not matched");
            }

        } while (correctPasswordEntered == 0);
        System.out.println("Do you want know why This softwares name is Beast Software.Yes or no. ");
        String beastAbout = getStringAsInput();
        if (beastAbout.equals("Yes"))
            System.out.println("It's name is beast software because it can do alot of thing.");
        System.out.println("What would you like to do" + name);

        System.out.println("1 = Calculator.");
        System.out.println("2 = Create pyramids.");
        System.out.println("3 = Check for odd and even.");
        System.out.println("4 = Check for negative and positive.");
        System.out.println("5 = Calculate Square area.");
        System.out.println("6 = Calculate Rectangle area.");
        System.out.println("7 = Calculate Triangle area.");
        System.out.println("8 = Calculate Circle area.");
        System.out.println("Have you made your choice : ");
        int menu = getIntAsInput();
        switch (menu) {
            case 1:
                calculator();
                break;

            case 2:
                pyramid();
                break;

            case 3:
                oddAndEven();
                break;

            case 4:
                negandpos();
                break;

            case 5:
                areaofsquar();
                break;

            case 6:
                areaofrectangle();
                break;

            case 7:
                areaoftriangle();
                break;

            case 8:
                areaofcircle();
                break;

            default:
                System.out.println("Wrong choice");
        }
    }

    //sub
    private static void oddAndEven() {
        System.out.println("Hello " + name + " welcome to odd and even.");
        System.out.println("Pls. enter a number : ");
        int number18 = getIntAsInput();
        if (number18 % 2 == 0)
            System.out.println("Your number is even");
        else
            System.out.println("Your number is odd");
    }

    private static void negandpos() {
        System.out.println("Hello " + name + " welcome to negitive and possitive.");
        System.out.println("Pls. enter a number : ");
        int number19 = getIntAsInput();
        if (number19 > 0) ;
        System.out.println("Your number is possitive : ");
        if (number19 < 0) ;
        System.out.println("Your number is negitive");
    }

    private static void pyramid() {
        System.out.println("Hello " + name + " welcome to The pyramid's.");
        System.out.println("H for half pyramid and V for vertical pyramid");
        String pyramidchoice = getStringAsInput();
        switch (pyramidchoice) {
            case "H":
                System.out.println("Pls. enter your number :");
                int number20 = getIntAsInput();
                for (int i = 1; i <= number20; ++i) {
                    for (int j = 1; j <= i; ++j) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case "V":
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
                break;

            default:
                System.out.println("You have chosen wrong choice");
        }
    }

    private static void areaofcircle() {
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

    private static void areaoftriangle() {
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

    //sub

    private static void areaofrectangle() {
        System.out.println("Hello " + name + " welcome to Rectangle's area.");
        System.out.println("Pls. enter a the length : ");
        int number10 = getIntAsInput();
        System.out.println("Pls. enter a the breadth : ");
        int number11 = getIntAsInput();
        int sub6 = number10 * 2 + number11 * 2;
        System.out.println("Total area of your Rectangle = " + sub6);
    }

    private static void areaofsquar() {
        System.out.println("Hello " + name + " welcome to Square area.");
        System.out.println("Pls. enter a number:");
        int number9 = getIntAsInput();
        int sub5 = number9 * 4;
        System.out.println("Total area of your square = " + sub5);
    }

    private static void calculator() {
        System.out.println("Hello " + name + " welcome to The Calculator.");
        System.out.println("What would you ike to do.");
        System.out.println("+ for Addition");
        System.out.println("- for Substraction");
        System.out.println("* for Multiply");
        System.out.println("/ for Divide");
        String number = getStringAsInput();
        switch (number) {
            case "+":
                System.out.println("Pls. enter your First number");
                int number1 = getIntAsInput();
                System.out.println("Pls. enter your Second number");
                int number2 = getIntAsInput();
                int sum1 = number1 + number2;
                System.out.println("Performing Addition...Total = " + sum1);
                break;
            case "-":
                System.out.println("Pls. enter your First number");
                int number3 = getIntAsInput();
                System.out.println("Pls. enter your Second number");
                int number4 = getIntAsInput();
                int sum2 = number3 - number4;
                System.out.println("Performing Substraction...Total = " + sum2);
                break;
            case "*":
                System.out.println("Pls. enter your First number");
                int number5 = getIntAsInput();
                System.out.println("Pls. enter your Second number");
                int number6 = getIntAsInput();
                int sum3 = number5 * number6;
                System.out.println("Performing Multiplication...Total = " + sum3);
                break;
            case "/":
                System.out.println("Pls. enter your First number");
                int number7 = getIntAsInput();
                System.out.println("Pls. enter your Second number");
                int number8 = getIntAsInput();
                int sum4 = number7 / number8;
                System.out.println("Performing Division...Total = " + sum4);
                break;
            default:
                System.out.println("Sorry you have taken a wrong choice");
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