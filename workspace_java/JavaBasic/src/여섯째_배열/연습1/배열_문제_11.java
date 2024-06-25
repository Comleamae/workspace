package 여섯째_배열.연습1;

public class 배열_문제_11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int r = 0;
        for(int num : arr){
            if(num % 2 == 0){
                r++;
            }
        }
        System.out.println(r);

//        int num = 0;
//        for(int i = 0; i < 8; i++){
//            if(arr[i] % 2 == 0){
//                num++;
//            }
//        }
//        System.out.println(num);
    }
}
