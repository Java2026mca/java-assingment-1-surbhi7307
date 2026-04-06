package q10;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        for(String s : exp.split(" ")) {
            if(s.matches("\\d+")) st.push(Integer.parseInt(s));
            else {
                int b = st.pop(), a = st.pop();
                if(s.equals("+")) st.push(a+b);
                else if(s.equals("-")) st.push(a-b);
                else if(s.equals("*")) st.push(a*b);
                else if(s.equals("/")) st.push(a/b);
            }
        }
        System.out.println(st.pop());
    }
}
