package q08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] stack = new int[size];
        int top = -1;
        
        while(sc.hasNext()) {
            String op = sc.next();
            if(op.equals("push")) {
                int val = sc.nextInt();
                if(top < size-1) stack[++top] = val;
            } else if(op.equals("pop")) {
                if(top >= 0) System.out.println("Popped: " + stack[top--]);
            } else if(op.equals("exit")) break;
        }
    }
}
