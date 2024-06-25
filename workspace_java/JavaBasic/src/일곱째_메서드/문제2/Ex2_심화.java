package 일곱째_메서드.문제2;

import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Random;

public class Ex2_심화 {
    public static void main(String[] args) {
        test2(5);
        test3(6);
        System.out.println(test4());
        System.out.println(test5(5));
        int[] arr = {1, 8, 5};
        test6(arr);
        int higherNum= test7(arr);
        System.out.println(higherNum);
        String[] arr2 = {"아", "에", "이", "오"};
        String result = test8(arr2);
        System.out.println(result);
        int[] arr3 = {1, 4, 5, 7, 8};
        int[] arr4 = {2, 6, 9};
        int[] newArr= test10(arr3);
        System.out.println(Arrays.toString(newArr));
        int[] newArr2 = test9(arr3, arr4);
        System.out.println(Arrays.toString(newArr2));


    }

    public static void test2(int a) {
        for (int i = 1; i < 10; i++) {
            int b = 0;
            b = b + a * i;
            System.out.println(a + " * " + i + " = " + b);
        }
    }

    public static void test3(int a){
        for(int i = 1; i < 101; i++){
                int b = i / a;
                if(i % a == 0){
                    System.out.println(a + "의" + b + "번째 배수는 " + i);
                }
                b++;
            }
    }

    public static int test4(){
        int b = (int)(Math.random() * 50 + 1);
        return b;
    }

    public static boolean test5 (int a){
       return a % 2 == 0 ? true : false;

       //return a % 2 == 0;

    }

    public static void test6 (int[] a){//int[] a = arr;
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
    }

    public static int test7(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static String test8(String[] a){
        String b = "";
        for (int i = 0; i < a.length; i++){
            b = b + a[i] + " ";
        }
        return b;
    }

    public static int[] test9(int[] a, int[] b){
        int totalLength = a.length + b.length;
        int[] newArr = new int[totalLength];
        int index = 0;
        for (int i = 0; i < totalLength; i++){
            if(a.length > i){
                newArr[index] = a[i];
                index++;
            }
            else {
                newArr[index] = b[i - a.length];
                index++;
            }
        }
        return newArr;
    }

    public static int[] test10(int[] arr){ //매개변수로 넘어온 배열 요소 중 짝수의 개수
        int ndNum = 0;

        for(int e : arr){
            if(e % 2 == 0){
                ndNum++;
            }
        }
        //짝수만 저장될 배열 생성
        int[] newArr = new int[ndNum];

        int index = 0;//새로운 배열의 요소 순서
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }

}


