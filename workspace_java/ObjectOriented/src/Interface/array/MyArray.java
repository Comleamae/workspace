package Interface.array;

public class MyArray implements MyArrayUtil{
    public static void main(String[] args) {
        MyArray a1 = new MyArray();
        int[] arr1 = {1, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] arr3 = {1, 3, 5, 8};
        System.out.println(a1.isEvenArray(arr3));
    }
    @Override
    public double getTwoArrayAvg(int[] arr1, int[] arr2) {
        int num1 = 0;
        int num2 = 0;
        double arrAvg = 0;
        for(int i = 0; i < arr1.length; i++){
            num1 = num1 + arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            num2 = num2 + arr2[i];
        }
        arrAvg = (num1 + num2) / (double)(arr1.length + arr2.length);
        return arrAvg;

    }

    @Override
    public boolean isEvenArray(int[] array) {
        /*
            for(int e : array){
                if(e % 2 == 1){
                return false;
                }
                return true;
            }

        */
        int num = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                num++;
            }
        }
        if(num == array.length){
            return true;
        }
        else {
            return false;
        }
        // num == array.length ?  true:false

    }
}
