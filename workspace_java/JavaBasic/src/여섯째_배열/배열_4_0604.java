package 여섯째_배열;

public class 배열_4_0604 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];//0 0 0 0 0
        //배열의 값을 저장할 때도 출력과 마찬가지로 각 요소에 데이터를 저장
        arr1[1] = 10;
        arr1[3] = 50;

        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
