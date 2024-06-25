package 다섯째_반복문.For.문제;

public class For_문제3 {
    public static void main(String[] args) {
        //1번 방법
         for(int i = 2; i < 11; i = i + 2){
             System.out.println(i + "");
         }
        //2번 방법
        for(int j = 1; j < 11; j++){
            if (j % 2 == 0){
                System.out.println(j + "");
            }
        }
    }
}
