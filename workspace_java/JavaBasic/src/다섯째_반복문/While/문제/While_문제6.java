package 다섯째_반복문.While.문제;

public class While_문제6 {
    public static void main(String[] args) {
        int a = 1;
        int cnt = 0;

        //1~100까지 반복해서 해당 숫자가 3의 배수인지 확인한다
        while (a < 101) {
            if(a % 3 == 0){
                cnt++;
            }
            a++;
        }
        System.out.println(cnt);
    }
}
