package q04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { isPrime = false; break; }
        }
        
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        boolean isPerfect = (sum == n);
        
        System.out.println("Prime: " + isPrime);
        System.out.println("Perfect: " + isPerfect);
    }
}
