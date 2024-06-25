package collection.list.ex3;

import java.util.ArrayList;
import java.util.List;

public class StudyClass {
    private List<Student> stdList;
    private String className;

    public String getClassName() {
        return className;
    }

    private String classTeacher;

    public List<Student> getStdList() {
        return stdList;
    }

    public StudyClass(List<Student> stdList, String className, String classTeacher){
       this.stdList = stdList;
       this.className = className;
       this.classTeacher = classTeacher;
   }
   public void printStdAll(){
        for(Student s : stdList) {
            System.out.println(s);
        }
   }

   public double avgScore(){
        int total = 0;
        double avgScore = 0.0;
        for(int i = 0; i < stdList.size(); i++){
            total = total + stdList.get(i).getScore();
        }
        avgScore = total / stdList.size();
        return avgScore;
   }

}
