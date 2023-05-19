package th1;

import java.io.*;

//  Lớp FileInputStream/FileOutputStream thuộc package java.io
//  Lớp này có 1 phương thức khởi tạo.
//
//  4 yếu tố của read đầu vào không có,đầu ra int,tên read,mục đích đọc byte dữ liệu tiếp theo từ luồng đầu vào này.
//  4 yếu tố của write()
//  4 yếu tố của phương thức clos() tham số đầu vào không có, đầu ra không có,tên close,mục đích đóng luồng đầu vào máy và giải phóng mọi tài nguyên hẹ thống liên kết với luồng.
//
//  Phương thức read() ném ra ngoại lệ
public class Fos {
    public static void main(String[] args)  {
        try {
            FileOutputStream fos=new FileOutputStream("person.dat");
            String name = "alaldsafsdfa";
            byte arr[] = name.getBytes();
            fos.write(arr);
            fos.close();

        }
        catch (IOException e){
            System.out.println("lỗi");
        }try {
            FileInputStream fis=new FileInputStream("person.dat");
            int i =0;
            while ((i = fis.read() )!= -1){
                System.out.print((char) i);
            }

            fis.close();
        }catch (IOException e){
            System.out.println("loi");
        }
    }
}
