import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double biology, history, physics, law, geometry, math;
        double result;

        System.out.println("*** Welcome to the GPA Calculator ***");
        try {
            System.out.print("Enter the grade for Biology: ");
            biology = scanner.nextDouble();
            if (biology < 0 || biology > 100){
                throw new InputMismatchException("Invalid input. Grade must be between 0 and 100.");
            }

            System.out.print("Enter the grade for History: ");
            history = scanner.nextDouble();
            if (history < 0 || history > 100){
                throw new InputMismatchException("Invalid input. Grade must be between 0 and 100.");
            }

            System.out.print("Enter the grade for Physics: ");
            physics = scanner.nextDouble();
            if (physics < 0 || physics > 100){
                throw new InputMismatchException("Invalid input. Grade must be between 0 and 100.");
            }

            System.out.print("Enter the grade for Law: ");
            law = scanner.nextDouble();
            if (law < 0 || law > 100){
                throw new InputMismatchException("Invalid input. Grade must be between 0 and 100.");
            }

            System.out.print("Enter the grade for Geometry: ");
            geometry = scanner.nextDouble();
            if (geometry < 0 || geometry > 100){
                throw new InputMismatchException("Invalid input. Grade must be between 0 and 100.");
            }

            System.out.print("Enter the grade for Math: ");
            math = scanner.nextDouble();
            if (math < 0 || math > 100){
                throw new InputMismatchException("Invalid input. Grade must be between 0 and 100.");
            }

            result = (biology + history + physics + law + geometry + math) / 6;


            if (result >= 51) {
                System.out.println("Your GPA is " + result + " (E)");
            } else if (result >= 61) {
                System.out.println("Your GPA is " + result + " (D)");
            } else if (result >= 71) {
                System.out.println("Your GPS is " + result + " (C)");
            } else if (result >= 81) {
                System.out.println("Your GPA is " + result + " (B)");
            } else if (result >= 91) {
                System.out.println("Your GPA is " + result + " (A)");
            } else if (result == 100) {
                System.out.println("Your GPA is " + result + " (A+) Highest Grade");
            } else {
                System.out.printf("Your GPA is %.2f%n (F) Did not pass the exam", result);
            }
        }catch (InputMismatchException exc){
            System.out.print("Please input only numbers between 0 and 100.");
        }
    }

}