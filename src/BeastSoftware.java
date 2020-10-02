public class BeastSoftware {

    private static String name;

    public static void main(String[] args) {
        System.out.println("Hello my name is Mahin.");
        System.out.println("What is your name : ");
        name = UserInput.getStringAsInput();

        System.out.println("Hello " + name + " welcome to Beast Software.");
        if ("Mahin".equalsIgnoreCase(name))
            System.out.println("Wow our name matche's.");
        System.out.println("Let's create your password.");

        int correctPasswordEntered = 0;
        do {
            System.out.println("Pls. enter your password here : ");
            String password1 = UserInput.getStringAsInput();
            System.out.println("Pls. re-enter your password : ");
            String password2 = UserInput.getStringAsInput();
            if (password1.equals(password2)) {
                correctPasswordEntered = 1;
                System.out.println("Password matched..");
            } else {
                System.out.println("Your password did not matched");
            }

        } while (correctPasswordEntered == 0);
        System.out.println("Do you want know why This Software's name is Beast Software.Yes or no. ");
        String beastAbout = UserInput.getStringAsInput();
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
            int menu2 = UserInput.getIntAsInput();
            switch (menu2) {
                case 1:
                    Calculator calculator = new Calculator();
                    calculator.calculate(name);
                    break;

                case 2:
                    Pyramid pyramid = new Pyramid();
                    pyramid.makePyramid(name);
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
                    Square isThisTheSquare = new Square();
                    Square.calculateArea(name);
                    break;

                case 6:
                    Rectangle isThisTheRectangle = new Rectangle();
                    Rectangle.calculateArea(name);
                    break;

                case 7:
                    Triangle calculateTriangle = new Triangle();
                    Triangle.calculateArea(name);
                    break;

                case 8:
                    Circle calculateCircle = new Circle();
                    Circle.calculateArea(name);
                    break;

                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you want to leave.");
            System.out.println("Yes or No : ");
            String yesNo2 = UserInput.getStringAsInput();
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

}