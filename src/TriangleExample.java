import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle sides!");
        try {
            System.out.print("Enter side 1: ");
            double side1 = scanner.nextDouble();
            System.out.print("Enter side 2: ");
            double side2 = scanner.nextDouble();
            System.out.print("Enter side 3: ");
            double side3 = scanner.nextDouble();
            Triangle triangle = new Triangle(side1,side2,side3);
        } catch (InputMismatchException exception) {
            System.out.println("Wrong type input!");
            System.out.println("Cause: " + exception.getMessage());
        } catch (IllegalTriangleException exception) {
            System.out.println(exception);
            System.out.println("Cause: " + exception.getMessage());
        }
    }
}
