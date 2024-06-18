package exception;

//예외전가
public class Exception_3 {
    public static void main(String[] args) {
        try {
            bbb();
        }catch (Exception e){

        }

    }

    public static void aaa() throws Exception {//예외 전가 방법 메소드 + throws Exception
        System.out.println(5 / 0);
    }

    public static void bbb() throws Exception {
        aaa();
    }
}
