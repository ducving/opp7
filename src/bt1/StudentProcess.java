package bt1;

import java.io.*;

public class StudentProcess {
    Student []products;
    int count;
    public StudentProcess(){
        products=new Student[5];
        count=0;
    }
    public boolean writeStudent(Student objStudent, String fileName) throws IOException {
        products[count++]=objStudent;
        FileOutputStream fos=new FileOutputStream(fileName);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(products);
        oos.close();
        bos.close();
        fos.close();
        return true;
    }
    public Student[] readStudent(String filename) throws IOException, ClassNotFoundException{
        FileInputStream fis=new FileInputStream(filename);
        BufferedInputStream bis=new  BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Student []students=(Student[]) ois.readObject();
        ois.close();
        bis.close();
        fis.close();
        return students;
    }

}
