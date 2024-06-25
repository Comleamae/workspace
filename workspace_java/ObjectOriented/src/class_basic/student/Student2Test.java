package class_basic.student;

//배열 + 클래스
public class Student2Test {
    public static void main(String[] args) {
        //학생을 5명 저장할 수 있는 배열 생성
        //학생 5명을 저장할 수 있는 공간 생성
        Student2[] listStd = new Student2[5]; //배열 안에 null x 5

        //배열에 저장할 학생 객체 생성
        Student2 s1 = new Student2("lee", 20, 80);
        Student2 s2 = new Student2("choi", 20, 40);
        Student2 s3 = new Student2("kim", 20, 87);
        Student2 s4 = new Student2("park", 20, 48);
        Student2 s5 = new Student2("shin", 20, 70);

        //배열 0번째 요소에 학생 s1을 저장
        listStd[0] = s1;
        listStd[1] = s2;
        listStd[2] = s3;
        listStd[3] = s4;
        listStd[4] = s5;

        //1.배열에 저장된 모든 학생의 이름, 나이, 점수 출력
        for(int i = 0; i < listStd.length; i++){
            listStd[i].printStd();//배열.
            System.out.println();
        }

        //1번 문제를 for-each문으로 해결
        for(Student2 e : listStd){
            e.printStd();
        }


        //2.배열에 저장된 학생 중 점수가 80점 이상인 학생의 이름, 나이, 점수 출력
        for(int i = 0; i < listStd.length; i++){
            if(listStd[i].getScore() >= 80){
                listStd[i].printStd();//배열.
                System.out.println();
            }
        }

        for(Student2 e : listStd){
            if(e.getScore() >= 70){
                e.printStd();
            }
        }
        //3. 이름이 'park'인 학생을 차장 해당 학생의 나이를 10으로 변경
        for(int i = 0; i < listStd.length; i++){
            if(listStd[i].getName().equals("park")){
                listStd[i].setAge(10);
            }
        }
        for (Student2 e: listStd){
            if(e.getName().equals("park")){
                e.setAge(40);
            }
        }





    }
}
