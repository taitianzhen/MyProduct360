package my360.liushuxin.example.com.myproduct360.entity;

/**
 * 学生实体类
 * Created by ZS on 16-7-1.
 */
public class Student {
    private String name;
    private int age;
    private char gender;

    public Student() {
    }

    public Student(int age, String name, char gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
