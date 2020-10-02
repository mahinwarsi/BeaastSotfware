import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeastSoftware {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static String name;

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
        System.out.println("Do you want know why This Software's name is Beast Software.Yes or no. ");
        String beastAbout = getStringAsInput();
        if (beastAbout.equals("Yes"))
            System.out.println("It's name is beast software because it can do alot of thing.");
        System.out.println("What would you like to do" + name);

        int continueOrLeave = 0;
        do {
            System.out.println("1 = Calculator.");
            System.out.println("2 = Create pyramids.");
            System.out.println("3 = Check for odd and even.");
            System.out.println("4 = Check for negative and positive.");
            System.out.println("5 = Calculate Square area.");
            System.out.println("6 = Calculate Rectangle area.");
            System.out.println("7 = Calculate Triangle area.");
            System.out.println("8 = Calculate Circle area.");
            System.out.println("Have you made your choice : ");
            int menu2 = getIntAsInput();
            switch (menu2) {
                case 1:
                    Calculator calculator = new Calculator();
                    calculator.calculate(name);
                    break;

                case 2:
                    Pyramid pyramid = new Pyramid();
                    pyramid.pyramid(name);
                    break;

                case 3:
                    OddAndEven isOddOrEven = new OddAndEven();
                    OddAndEven.isOddOrEven(name);
                    break;

                case 4:
                    NegAndPos isThisNegOrPos = new NegAndPos();
                    NegAndPos.isThisNegOrPos(name);
                    break;

                case 5:
                    AreaOfSquare isThisTheAreaOfSquare = new AreaOfSquare();
                    AreaOfSquare.isThisTheAreaOfSquare(name);
                    break;

                case 6:
                    AreaOfRectangle isThisTheAreaOfRectangle = new AreaOfRectangle();
                    AreaOfRectangle.isThisTheAreaOfRectangle(name);
                    break;

                case 7:
                    AreaOfTriangle calculateTriangle = new AreaOfTriangle();
                    AreaOfTriangle.calculateTriangle(name);
                    break;

                case 8:
                    AreaOfCircle calculateAreaOfCircle = new AreaOfCircle();
                    AreaOfCircle.calculateAreaOfCircle(name);
                    break;

                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you want to leave.");
            System.out.println("Yes or No : ");
            String yesNo2 = getStringAsInput();
            if (yesNo2.equalsIgnoreCase("Yes")) {
                System.out.println("Made By Mahin Alam Warsi.");
                System.exit(0);
                continueOrLeave = 1;
            } else {
                if (yesNo2.equalsIgnoreCase("No")) {
                    continueOrLeave = 0;
                }
            }
        } while (continueOrLeave == 0);
    }
        

    //sub
    

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