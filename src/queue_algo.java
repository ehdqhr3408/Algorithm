import java.util.LinkedList;
import java.util.Queue;

public class queue_algo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(3);
        queue.offer(2);
        System.out.println(queue.poll());
        queue.offer(6);
        queue.offer(8);
        System.out.println(queue.peek());
        while (queue.isEmpty() == false) {
            System.out.println(queue.poll());
        }
    }
}
