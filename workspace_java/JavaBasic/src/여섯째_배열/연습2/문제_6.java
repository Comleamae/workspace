package 여섯째_배열.연습2;

public class 문제_6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] newArr = new int[6];

        for(int i = 0; i < newArr.length; i++){
            if(i < 3){
                newArr[i] = arr1[i];
                System.out.println(newArr[i]);
            }
            else {
                newArr[i] = arr2[i-3];
                System.out.println(newArr[i]);
            }

        }

    }
}
