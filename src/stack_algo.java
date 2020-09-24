import java.util.Stack;

public class stack_algo {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        System.out.println(stack.pop());
        stack.push(6);
        stack.push(8);
        System.out.println(stack.peek());
        System.out.println(stack.search(6));
        while (stack.empty() == false) {
            System.out.println(stack.pop());
        }
    }
}
