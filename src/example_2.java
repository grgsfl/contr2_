import java.util.Scanner;

public class example_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}