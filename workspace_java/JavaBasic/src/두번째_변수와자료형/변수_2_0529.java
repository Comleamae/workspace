package 두번째_변수와자료형;

/*
    변수는 데이터를 저장하기 위한 공간
    변수 사용을 위해서는 반드시 변수를 선언부터 해야 함
    변수의 선언 문법은 [자료형 변수명;]
    변수는 원하는 만큼 개수 제한없이 선언 가능
    변수 각각의 이름은 중복 불허(대소문자 구분)
    하나의 변수에는 하나의 값만 저장
    -------------------------------------------
    변수명의 명명법
    변수는 소문자로 선언(관례)
    변수는 예약어, 지정어를 사용할 수 없다(이미 java에서 쓰고 있는 문법)
    변수는 한글로 선언 가능하지만 영어 권유
    변수의 이름은 직관적이게 선언
    복합어(합성어)의 변수는 camelCase 기법으로 선언
*/
public class 변수_2_0529 {
    public static void main(String[] args) {
        //학생번호(학번) ex) int studentNumber;-> int stNum; or int student_number;->자바스크립트에서 많이 사용
        //나이를 저장할 변수 ex) int age;
        //정수를 저장할 수 있는 변수 num1 선언
        int num1;
        //정수를 저장할 수 있는 변수 num2 선언
        int num2;
        //num1 변수에 정수 10 저장
        num1 = 10;
        //num2 변수에 정수 20 저장
        num2 = 20;
        //정수를 저장할 수 있는 변수 num3 선언
        int num3;
        //num3 변수에 num1과 num2 변수가 가진 값의 합을 저장
        num3 = num1 + num2;
        //num1에 저장된 값 출력
        System.out.println("num1 = " + num1);
        //num2에 저장된 값 출력
        System.out.println("num2 = " + num2);
        //num3에 저장된 값 출력
        System.out.println("num3 = " + num3);

    }
}
