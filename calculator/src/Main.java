import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static double addition(double numberOne, double numberTwo) {

        return numberOne + numberTwo;
    }

    public static double subtract(double numberOne, double numberTwo) {

        return numberOne - numberTwo;
    }

    public static double multiply(double numberOne, double numberTwo) {

        return numberOne * numberTwo;
    }

    public static double divide(double numberOne, double numberTwo) {

        return numberOne / numberTwo;
    }

    public static double squareRootMethod(Scanner scnr) {

        int numberToSquare;
        System.out.println("Enter the number to be squared: ");
        numberToSquare = scnr.nextInt();

        return Math.sqrt(numberToSquare);
    }

    public static double powerOf(Scanner scnr) {
        double baseNumber;
        int ofPower;

        System.out.println("Enter the base number: ");
        baseNumber = scnr.nextInt();

        System.out.println("Enter the power of the number: ");
        ofPower = scnr.nextInt();

        return Math.pow(baseNumber, ofPower);
    }

    public static void quadraticFormula(Scanner scnr) {
        double a;
        double b;
        double c;
        double xOne;
        double xTwo;

        System.out.println("Please enter value for \"A\": ");
        a = scnr.nextDouble();

        System.out.println("Please enter value for \"B\": ");
        b = scnr.nextDouble();

        System.out.println("Please enter value for \"C\": ");
        c = scnr.nextDouble();

        xOne = quadraticFormulaTopEquationPlus(a, b, c) / (2 * a);
        xTwo = quadraticFormulaTopEquationNegative(a, b, c)  / (2 * a);

        System.out.println("x\u2081 = " + xOne);
        System.out.println("x\u2082 = " + xTwo);
    }

    public static double quadraticFormulaTopEquationPlus(double a, double b, double c) {
        double firstHalf;
        double secondHalf;
        double totalPlus;

        firstHalf = (b * -1);
        secondHalf = Math.sqrt((b*b) - (4* a * c));

        totalPlus = firstHalf + secondHalf;

        return totalPlus;
    }

    public static double quadraticFormulaTopEquationNegative(double a, double b, double c) {
        double firstHalf;
        double secondHalf;
        double totalNegative;

        firstHalf = (b * -1);
        secondHalf = Math.sqrt((b*b) - (4* a * c));

        totalNegative = firstHalf - secondHalf;

        return totalNegative;
    }

    public static double calculations(char equation, double numberOne, double numberTwo ) {

        switch (equation) {
            case '+':
                numberOne = addition(numberOne, numberTwo);
                break;
            case '-':
                numberOne = subtract(numberOne, numberTwo);
                break;
            case '*':
                numberOne = multiply(numberOne, numberTwo);
                break;
            case '/':
                numberOne = divide(numberOne, numberTwo);
                break;
        }
        return numberOne;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double calcNumTwo;
        char parameter = ' ';
        String needComplexNum;
        double currentTotal;

        System.out.println("Are you needing a complex number? (eg. square root): Yes/No");
        needComplexNum = scnr.nextLine().toLowerCase();

        if (needComplexNum.equals("yes")) {
            String complexProcess;
            System.out.println("Currently square root and \"power of\" is available (sqrt / powr / quadratic): ");
            complexProcess = scnr.nextLine().toLowerCase();

            switch (complexProcess) {
                case "sqrt":
                    System.out.println("The square root is: " + squareRootMethod(scnr));
                    break;
                case "powr":
                    System.out.println("Total is: " + powerOf(scnr));
                    break;
                case "quadratic":
                    quadraticFormula(scnr);
                }
        } else {

            boolean needMore = true;

            System.out.println("Please enter your number: ");
            currentTotal = scnr.nextDouble();

            while (needMore) {
                boolean parameterTrue = false;
                while (!parameterTrue) {
                    System.out.println("What would you like to do with these numbers? (+ - * /): ");
                    parameter = scnr.next().charAt(0);

                    if (parameter == '+' || parameter == '-' || parameter == '*' || parameter == '/') {
                        parameterTrue = true;
                    }
                }
                System.out.println("Please enter your number: ");
                calcNumTwo = scnr.nextDouble();

                currentTotal = calculations(parameter, currentTotal, calcNumTwo);

                System.out.println("Current total = " + currentTotal);

                System.out.println("Do you need more numbers? (Yes/No)");
                if (scnr.next().equalsIgnoreCase("no")) {
                    needMore = false;
                }
            }
        }
    }
}


