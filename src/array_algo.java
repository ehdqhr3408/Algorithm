import java.util.Arrays;
import java.util.Collections;

public class array_algo {
    public static void main(String[] args){
        //Integer오름차순
        /*int []arr = {4,23,33,15,17,19};
        Arrays.sort(arr);

        for(int i : arr){
            System.out.printf("["+i+"]");
        }*/

        //String 내림차순
        String []arr = {"apple", "orange", "banana", "pear", "peach", "melon"};
        Arrays.sort(arr, Collections.reverseOrder());

        for(String i : arr){
            System.out.printf("["+i+"]");
        }
    }
}
