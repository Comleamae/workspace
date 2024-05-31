package 첫번째_출력문;

public class Exam3_0529 {
    public static void main(String[] args){
        //문자열은 반드시 쌍다옴표에 감싸서 작성
        System.out.println("안녕하세요");
        //숫자는 쌍따옴표에 감싸지 않음
        System.out.println(10); //숫자10으로 인식->연산가능
        System.out.println("10"); //문자10으로 인식
        //sout+enter
        //소괄호 안의 내용이 연산 가능하면 연산 결과 출력
        System.out.println(10 + 10);
        //문자끼리의 합은 문자를 연결
        System.out.println("java" + "hello");
        //숫자와 문자의 합은 숫자를 문자로 간주하고 나열->결과물은 문자
        System.out.println("java" + 10);
        System.out.println(10 + 20 + "java");
        System.out.println(10 + 20 +"java" + 20);

        System.out.println(10 > 5);//true
        System.out.println(10 < 5);//false
        //1과 1이 같습니까?
        System.out.println(1 == 1);//같다
        System.out.println(1 != 1);//다르다

    }
}
