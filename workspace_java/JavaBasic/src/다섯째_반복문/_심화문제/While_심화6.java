package 다섯째_반복문._심화문제;

public class While_심화6 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        for (i = 1; i < 100; i++){
            sum = sum + i;
            if(sum > 300){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(i);
    }
}
