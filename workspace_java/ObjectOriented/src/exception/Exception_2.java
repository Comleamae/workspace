package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.print("첫번째 : ");
                int a = sc.nextInt();
                System.out.print("두번째 : ");
                int b = sc.nextInt();

                System.out.println(a / b);

                //ArithmeticException = 수학적인 예외를 처리하는 예외 처리 클래스
                //InputMismatchException = 문자적인 예외를 처리하는 예외 처리 클래스
                //Exception = 모든 예외 처리 클래스의 부모 클래스
            }catch (ArithmeticException exception) {
                System.out.println("수학적 오류발생~");

            }catch (InputMismatchException e) {
                System.out.println("입력 자료형 불일치");
            }
            System.out.println("프로그램 종료");
        }



    }

