import java.util.Scanner;

public class Main {
    public static void addition(double num1, double num2) {
        System.out.println(num1+num2);
    }

    public static void subtract(double num1, double num2) {
        System.out.println(num1-num2);
    }

    public static void multiply(double num1, double num2) {
        System.out.println(num1*num2);
    }

    public static void divide(double num1, double num2) {
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double firstNum;
        double secondNum;
        String parameter;

        System.out.println("Please enter your first number: ");
        firstNum = scnr.nextDouble();

        System.out.println("Please enter your second number: ");
        secondNum = scnr.nextDouble();

        System.out.println("What would you like to do with these numbers? (+ - * /): ");
        parameter = scnr.next();

        if (parameter.equals("+")) {
            parameter = "add";
        } else if (parameter.equals("-")) {
            parameter = "sub";
        }else if (parameter.equals("*")) {
            parameter = "mult";
        }else if (parameter.equals("/")) {
            parameter = "div";
        }

        switch (parameter) {
            case "add":
                addition(firstNum,secondNum);
                break;
            case "sub":
                subtract(firstNum,secondNum);
                break;
            case "mult":
                multiply(firstNum,secondNum);
                break;
            case "div":
                divide(firstNum,secondNum);
                break;
        }
    }
}