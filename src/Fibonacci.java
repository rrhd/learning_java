import java.util.Scanner;

public class Fibonacci {

    public static int calc(int fibonacciN) {
        if (fibonacciN == 0) {
            return 0;
        } else if (fibonacciN == 1) {
            return 1;
        } else {
            return calc(fibonacciN - 1) + calc(fibonacciN - 2);
        }
    }

    public static void selectFib() {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerFib = new Scanner(System.in);
        String doFibonacci = "y";
        int fibonacciN;
        int fibonacciF;
        while (doFibonacci.equals("y")) {
            System.out.println("Choose element in Fibonacci sequence to calculate: ");
            fibonacciN =  scanner.nextInt();
            fibonacciF = calc(fibonacciN);
            System.out.println("Fibonacci number " + fibonacciN + " is " + fibonacciF);
            System.out.print("Calculate another Fibonacci number? [y/n]: ");
            doFibonacci = scannerFib.nextLine();
        }
    }

    public static void main(String[] args) {
        selectFib();
    }

}
