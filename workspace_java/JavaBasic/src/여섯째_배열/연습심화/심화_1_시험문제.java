package 여섯째_배열.연습심화;

public class 심화_1_시험문제 {
    public static void main(String[] args) {
        int max = 0;
        int[] arr = {1, 5, 3, 8, 2, 10, 7};

        for (int i = 0; i < arr.length; i++){
            if(max < arr[i] ){
                max = arr[i];
            }
        }
        System.out.println("max: " +max);
    }
}
