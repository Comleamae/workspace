package 여섯째_배열.연습2;

public class 문제_2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int num = 0;
        for(int i = 0; i < 100; i++){
            arr[i] = i + 1;
            if(arr[i] % 2 != 0 && arr[i] % 3 != 0 && arr[i] % 5 !=0 && arr[i] % 7 != 0){
                System.out.println(arr[i]);
            }
            if(arr[i]  == 2 ){
                System.out.println(arr[i]);
            }
            if(arr[i]  == 3 ){
                System.out.println(arr[i]);
            }
            if(arr[i] == 5){
                System.out.println(arr[i]);
            }
            if(arr[i] == 7){
                System.out.println(arr[i]);
            }
        }
    }
}
