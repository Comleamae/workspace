package Test1;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        for(int i = 0; i < arr.length; i++){
            int rNum = (int)(Math.random() * 45 + 1);
            arr[i] = rNum;
        }


        System.out.printf(Arrays.toString(arr));


    }
}
