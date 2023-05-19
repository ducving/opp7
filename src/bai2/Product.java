package bai2;

import java.io.Serializable;

public class Product implements Serializable {
    int code;
    String name;
    int price;
    String hsx;
    public Product(){

    }

    public Product(int code, String name, int price, String hsx) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.hsx = hsx;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHsx() {
        return hsx;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    @Override
    public String toString() {
        return
                " code = " + code +
                ", name = " + name +
                ", price = " + price +
                ", hsx = " + hsx ;
    }
}
