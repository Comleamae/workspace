package Interface.array;
//제공한 인터페이스와 같은 패키지에 MyArray라는 클래스 생성
//MyArray 클래스는 아래에 제시한 MathUtil 인터페이스를 구현해야함
//MyArray 클래스에 인터페이스를 주석에 맞게 구현
public interface MyArrayUtil {
    //매개변수로 받은 두 배열의 모든 요소의 평균을 리턴
    double getTwoArrayAvg(int[] arr1, int[] arr2);

    //매개변수로 받은 배열의 모든 요소가 짝수 일때만 리턴 true
    boolean isEvenArray(int[] array);
}