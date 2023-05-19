package th2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Th2 {
    public boolean writeData(String data, String fileName) throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            byte arr[] = data.getBytes();
            fos.write(arr);
            fos.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    public void readData(String fileName) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            fis.read();
            int i=0;
            while ((i=fis.read())!=-1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println("sa");
        }
    }
}
