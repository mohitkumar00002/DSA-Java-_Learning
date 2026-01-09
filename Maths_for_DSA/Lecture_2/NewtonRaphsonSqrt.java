import java.util.Scanner;

public class NewtonRaphsonSqrt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double n = sc.nextDouble();

        System.out.print("Enter precision (example 0.0001): ");
        double precision = sc.nextDouble();

        double result = sqrtNewton(n, precision);
        System.out.println("Square root = " + result);
    }

    static double sqrtNewton(double n, double precision) {

        double guess = n;       // initial guess
        double nextGuess;

        while (true) {
            nextGuess = (guess + n / guess) / 2;

            if (Math.abs(nextGuess - guess) < precision) {
                break;
            }

            guess = nextGuess;
        }

        return nextGuess;
    }
}
