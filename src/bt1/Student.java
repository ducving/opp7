package bt1;

import java.io.Serializable;

public class Student implements Serializable {
    int code;
    String name;
    int old;
    String cl;

    public Student(int code, String name, int old, String cl) {
        this.code = code;
        this.name = name;
        this.old = old;
        this.cl = cl;
    }
}
