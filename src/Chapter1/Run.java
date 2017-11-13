package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

    }
}


class Person{
    private String name;
    private int age;
    private boolean gender;
    private int id;

    private static int personID = 0;
    static {
        System.out.println("This is static initialization block");
    }

    {
        id = personID;
        personID++;
        System.out.println("This is initialization block, id is "+id);
    }

    public Person(String name, boolean gender,int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public Person(){
        System.out.println("This is constructor");
        System.out.println(name+","+age+","+isGender()+","+id);
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [" +
                "name=" + name  +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ']';
    }
}

class Student{
    private String name;
    private String sex;
    private int age;



    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}

class Rectangle{
    int width;
    int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle [" +
                "width=" + width +
                ", length=" + length +
                ']';
    }

    public int getPerimeter(){
        return 2*(width+length);
    }

    public int getArea(){
        return width*length;
    }
}

class Circle{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [" +
                "radius=" + radius +
                ']';
    }

    public int getPerimeter(){
        double p = Math.PI*2*radius;
        return (int)p;
    }

    public int getArea(){
        double area = Math.PI*radius*radius;
        return (int)area;
    }
}
