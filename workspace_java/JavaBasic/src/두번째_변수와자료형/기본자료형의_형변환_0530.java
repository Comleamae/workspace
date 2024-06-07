package 두번째_변수와자료형;

public class 기본자료형의_형변환_0530 {
    public static void main(String[] args) {
        //정수는 실수에 저장 가능
        //자동 형 변환(promotion) ex)정수를 실수로 변환
        int num1 = 5;
        double num2 = num1;
        System.out.println("num2 = " + num2);

        //강제 형변환(Casting) => 정수와 실수만 가능 아직은
        double num3 = 5.5;
        //int num4 = num3; 실수는 정수형에 저장불가 오류
        int num4 = (int)num3; //실수 데이터 num3를 int로 강제 형 변환
        System.out.println("num4 = " + num4);

    }
}
