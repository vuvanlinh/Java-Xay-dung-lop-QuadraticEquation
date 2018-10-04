import java.util.Scanner;

public class RunningProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no root");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("root = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("root 1 = " + quadraticEquation.getRoot1());
            System.out.println("root 2 = " + quadraticEquation.getRoot2());
        }
    }
}
