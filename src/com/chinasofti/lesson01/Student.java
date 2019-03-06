package com.chinasofti.lesson01;


import com.chinasofti.util.Property;
import com.chinasofti.util.Table;

@Table(name="stu")
public class Student {

    @Property(name="s_id",len = 11)
    private int id;
    @Property(name="s_name",len = 50)
    private String name;
    @Property(name="s_class",len = 50)
    private String classname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                '}';
    }
}
