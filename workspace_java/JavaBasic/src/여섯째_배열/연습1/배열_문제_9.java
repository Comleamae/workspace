package 여섯째_배열.연습1;

public class 배열_문제_9 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = arr[i] + sum;
        }
        System.out.println(sum);
    }
}
