import java.util.Scanner;

public class example_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задайте число для вычисления факториала:");
        int n = scanner.nextInt();

        int factorial = fact(n);

        System.out.println("Факториал числа " + n + " равен = " + factorial);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        else {
            return n * fact(n - 1);
        }
    }
}