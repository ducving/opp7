package bt1;

import java.io.IOException;

public class StudentApp {
    public static void main(String[] args) {
        Student student1=new Student(1,"dsa",15,"dasd");
        Student student2=new Student(2,"dsdsd",13,"dsad");
        Student student3=new Student(3,"dsdsd",13,"dsad");
        Student student4=new Student(4,"dsdsd",13,"dsad");
        Student student5=new Student(5,"dsdsd",13,"dsad");
        StudentProcess studentProcess=new StudentProcess();
        try {
            studentProcess.writeStudent(student1,"abc.oc");
            studentProcess.writeStudent(student2,"abc.oc");
            studentProcess.writeStudent(student3,"abc.oc");
            studentProcess.writeStudent(student4,"abc.oc");
            studentProcess.writeStudent(student5,"abc.oc");
        }catch (IOException e){
         e.printStackTrace();
        }
    }

}
