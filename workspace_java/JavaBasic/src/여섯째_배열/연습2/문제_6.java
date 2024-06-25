package 여섯째_배열.연습2;

public class 문제_6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 8};
        int[] arr2 = {4, 5, 6, 7};
        int[] newArr = new int[arr1.length + arr2.length];
        /////////////////////자작풀이
        for(int i = 0; i < newArr.length; i++){
            if(i < arr1.length){
                newArr[i] = arr1[i];
                System.out.print(newArr[i] + " ");
            }
            else {
                newArr[i] = arr2[i-arr1.length];
                System.out.print(newArr[i] + " ");
            }

        }

        System.out.println(" ");
        ///////////////////////////풀이-2
        for(int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for(int i =0; i < arr2.length; i++){
            newArr[arr1.length + i] = arr2[i];
        }

        for(int e : newArr){
            System.out.print(e + " ");
        }

    }
}
