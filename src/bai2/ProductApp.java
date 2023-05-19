package bai2;

import java.io.IOException;

public class ProductApp {
    public static void main(String[] args) {

        try {
            Product product1=new Product(1,"Iphone",11,"nokia");
            Product product2=new Product(2,"Iphone",12,"nokia");
            Product product3=new Product(3,"Iphone",13,"nokia");
            Product product4=new Product(4,"Iphone",14,"nokia");
            Product product5=new Product(5,"Iphone",15,"nokia");
            ProductProcess productProcess=new ProductProcess();
            productProcess.writeProduct(product1,"person.dat");
            productProcess.writeProduct(product2,"person.dat");
            productProcess.writeProduct(product3,"person.dat");
            productProcess.writeProduct(product4,"person.dat");
            productProcess.writeProduct(product5,"person.dat");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
