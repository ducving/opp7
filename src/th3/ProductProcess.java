package th3;

import java.io.*;

public class ProductProcess {
    Product[] products;
    int count;
//    khoi tao ham khong tham so va gan gia tri
    public ProductProcess() {
        products = new Product[100];
        count = 0;
    }
//    phuong thuc ghi
    public boolean writeObjectData(Product objProduct, String fileName) throws IOException {
        products[count++] = objProduct;
        FileOutputStream fos = new FileOutputStream(fileName);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(products);
        oos.close();
        bos.close();
        fos.close();
        return true;
    }

    public Product[] readObjectData(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
//        ep kieu
        Product[] product = (Product[]) ois.readObject();

        ois.close();
        bis.close();
        fis.close();
        return product;
    }
}
