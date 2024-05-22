package org.example;

public class Student {
    private int i;
    private String name;
    private String s;

    public Student(int i, String name, String s) {
        this.i = i;
        this.name = name;
        this.s = s;
    }

    public Student() {

    }

    public void setId(int i) {
        this.i = i;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSem(String s) {
        this.s = s;
    }
}
