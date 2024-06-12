package 상속.family;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
//02번-Parent(String nation) call
//     Parent() call
//      Child(String name) call
//      Child() call
//10번-"생성자A:10"
//     "생성자A"
//     "생성자B:11"
/*11번
    //LCD클래스에 size변수 값을 초기화 코드
    1)super(size);
    클래스 결합도는 낮고,
    클래스 하나는 응집도는 높은 코드(클래스)가 좋은 코드
    2)this.size = size;
*/

/*8번
    private int j -> protected int j //해당 클래스 + 그 클래스를 상속한 자식 클래스
    return n + i + j; -> return n + i + getJ()
*/
