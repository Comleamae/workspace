package 다섯째_반복문._심화문제;

public class While_심화3 {
    public static void main(String[] args) {
        int i =0, k = 0;
        for(i = 1; i < 100; i++){
            k += i;
            if(k > 100)
                break;
        }
        System.out.println(i);
    }
}
//i = 14
//k는 1부터 99까지의 합
// i = 1 k = k + i
// i = 2 k = 1 + 2
// i = 3 k = 3 + 3
// i = 4 k = 6 + 4
// i = 10 k = 55
// i  = 14 k =1