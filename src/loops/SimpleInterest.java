package loops;


import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter principal : ");
        float principal = scanner.nextFloat();

        System.out.println("Enter rate : ");
        float rate = scanner.nextFloat();

        System.out.println("Enter time : ");
        float time = scanner.nextFloat();

        // Calculate simple interest
        double result = (principal * rate * time) / 100;

        System.out.println("Simple interest : " + result);
    }
}

