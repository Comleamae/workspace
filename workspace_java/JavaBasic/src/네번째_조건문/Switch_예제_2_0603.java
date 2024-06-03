package 네번째_조건문;

import java.util.Scanner;

/*
    주민등록번호의 7번째 자리는 성별
    7번째 자리의 수가 1 또는 3은 남자
    7번째 자리의 수가 2 또는 4은 여자
    키보드를 주민등록번호 7번째 자리를 입력 받아
    남자-남성 출력
    여자-여성 출력
    잘못된 숫자 - 오류 출력
*/
public class Switch_예제_2_0603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호 7번째 자리 수를 입력하라: ");
        int num = sc.nextInt();
        int cal = num;
        switch (cal){
            case 1:
            case 3:
                System.out.println("남성");
                break;
            case 2, 4:
                System.out.println("여성");
                break;
            default:
                System.out.println("오류");
        }
    }
}
