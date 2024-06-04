package 여섯째_배열.연습2;

public class 문제_11 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            int rNum = (int)(Math.random() * 40 + 5);
            if (arr[i] == rNum){
                arr[i] = rNum;

            }
            System.out.println(arr[i]);
        }
    }
}
