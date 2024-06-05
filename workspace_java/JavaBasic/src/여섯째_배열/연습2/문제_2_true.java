package 여섯째_배열.연습2;

public class 문제_2_true {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int prNum = 0;
        int num = 0;
        for(int i = 1; i < 100; i++){
            arr[i] = i + 1;
            if(arr[i] < 0){
                System.out.println(arr[i]);
            }

        }
    }
}
