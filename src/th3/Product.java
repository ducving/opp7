package th3;

import java.io.Serializable;

public class Product implements Serializable {
    private int proID;
    private String proName;
    private int price;
    public Product(){
        this.proID = 0;
        this.proName ="abc";
        this.price =0;
    }

    public Product(int proID, String proName, int price) {
        this.proID = proID;
        this.proName = proName;
        this.price = price;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "  proID = " + proID +
                "  proName = " + proName +
                "  price = " + price ;
    }

}
