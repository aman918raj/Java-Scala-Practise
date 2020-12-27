import java.util.ArrayDeque;
import java.util.Deque;

public class LoadBalance {

    public static void main(String[] args) {

        String s1 = "{([]{}[]())}";
        String s2 = "(){[]";
        boolean bool1 = testBalance(s1);
        System.out.println(bool1);
        boolean bool2 = testBalance(s2);
        System.out.println(bool2);
    }

    public static boolean testBalance(String s) {

        Deque<Character> stack = new ArrayDeque<Character>();
        char[] c = s.toCharArray();
        boolean bool = false;
        char x;
        for (char a : c) {

            if (a == '(' || a == '{' || a == '[')
                stack.push(a);

            if (stack.isEmpty())
                return false;


            switch (a) {
                case ')':
                    x = stack.getFirst();
                    stack.pop();
                    if (x == '[' || x == '{')
                        return false;
                    break;
                case '}':
                    x = stack.getFirst();
                    stack.pop();
                    if (x == '(' || x == '[')
                        return false;
                    break;
                case ']':
                    x = stack.getFirst();
                    stack.pop();
                    if (x == '(' || x == '{')
                        return false;
                    break;
            }

        }

        if (stack.isEmpty())
            bool = true;
        return bool;
    }
}
