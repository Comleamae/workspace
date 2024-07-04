import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;
        int max, mid, min;

        System.out.print("첫 번째 수를 입력하시오");
        num1 = sc.nextInt();
        System.out.print("두 번째 수를 입력하시오");
        num2 = sc.nextInt();
        System.out.print("세 번째 수를 입력하시오");
        num3 = sc.nextInt();


        if(num1 > num2 && num1 > num3){
            max = num1;
            if(num2 > num3){
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        }
        else if (num2 > num1 && num2 > num3){
            max = num2;
            if(num1 > num3){
                mid = num1;
                min = num2;
            }
            else {
                mid = num2;
                min = num1;
            }

        }
        else {
            max = num3;
            if(num1 > num2){
                mid = num1;
                min = num2;
            }
            else {
                mid = num2;
                min = num1;
            }
        }
        System.out.printf("큰 순서대로 "+ max +" " + mid + " " + min);
    }
}
