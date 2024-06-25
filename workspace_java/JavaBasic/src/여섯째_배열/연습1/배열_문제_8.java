package 여섯째_배열.연습1;

public class 배열_문제_8 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i]= arr[i] + i + 1;
            System.out.println(arr[i]);
        }
    }
}
