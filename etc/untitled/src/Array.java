import java.sql.SQLOutput;
import java.util.Arrays;

public class Array {
   public static void main(String[] args) {
      int[] arr = {1, 5, 3, 8, 2};
      int[] arr2 = new int[5];

      for (int i = 0; i < arr.length; i++) {
         for(int j = 0; j <arr.length; j++){
            if (arr[i] >= arr[i + 1]) {
               arr[i + 1] = arr[i];

            }
         }

      }
      System.out.println(Arrays.toString(arr));
      }
   }

