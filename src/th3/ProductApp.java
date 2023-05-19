package th3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProductApp {
    public static void main(String[] args)  {

        try {
            File file=new File("object.dat");
            file.createNewFile();
            Product objProduct1=new Product();
            objProduct1.setPrice(212);
            objProduct1.setProID(122);
            objProduct1.setProName("trong");
            Product objProduct2=new Product(1,"vinh",3);
            ProductProcess objProductProcess=new ProductProcess();
            objProductProcess.writeObjectData(objProduct1,"object.dat");
            objProductProcess.writeObjectData(objProduct2,"object.dat");
            Product []listProduct =  objProductProcess.readObjectData("object.dat");
            for (Product pc: listProduct) {
                System.out.println(pc);
                if(pc== null){
                    break;
                }
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }

    }
}
