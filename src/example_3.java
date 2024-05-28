import java.util.Scanner;

public class example_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите координаты 1-ой вершины (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Укажите координаты 2-ой вершины (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Укажите координаты 3-ей вершины (x3 y3):");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        double v1 = length(x1, y1, x2, y2);
        double v2 = length(x2, y2, x3, y3);
        double v3 = length(x1, y1, x3, y3);

        double perim = v1 + v2 + v3;

        System.out.println("Периметр равен = " + perim);
    }

    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}