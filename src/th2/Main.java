package th2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Th2 th2=new Th2();
        boolean result = th2.writeData("2232332","person.dat");
        if(result){
            System.out.println("Luu thanh cong");
        }
        th2.readData("abc.oc");
    }
}
