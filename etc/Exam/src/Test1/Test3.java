package Test1;
public class Test3 {
    public static void main(String[] args) {
        int [] arr = {5, 11, 20, 40, 30};

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }

        }
        System.out.printf("큰 값은 : "+ max + " ");
        System.out.printf("작은 값은 : "+ min);
    }
}
