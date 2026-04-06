package q05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.next().toLowerCase();
        if (shape.equals("circle")) {
            double r = sc.nextDouble();
            System.out.printf("%.2f\n", Math.PI * r * r);
        } else if (shape.equals("rectangle")) {
            double l = sc.nextDouble(), b = sc.nextDouble();
            System.out.printf("%.2f\n", l * b);
        } else if (shape.equals("triangle")) {
            double b = sc.nextDouble(), h = sc.nextDouble();
            System.out.printf("%.2f\n", 0.5 * b * h);
        }
    }
}
