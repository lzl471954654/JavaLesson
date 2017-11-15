package Chapter4;

import sun.security.provider.SHA;

import java.util.Scanner;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPeri();

    public static void main(String[] args) {
        double r,chang,kuan;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            r = scanner.nextDouble();
            chang = scanner.nextDouble();
            kuan = scanner.nextDouble();
            Circle circle = new Circle(r);
            Rectangle rectangle = new Rectangle(chang,kuan);
            System.out.println(circle);
            System.out.println(rectangle);
        }
    }
}

class Rectangle extends Shape{
    double chang;
    double kuan;

    @Override
    public String toString() {
        return "Circle area="+getArea()+", peri="+getPeri();
    }

    @Override
    public double getArea() {
        return chang*kuan;
    }

    @Override
    public double getPeri() {
        return 2*(chang+kuan);
    }

    public Rectangle(double chang, double kuan) {
        if(chang<0)
            this.chang = 0;
        else
            this.chang = chang;
        if(kuan<0)
            this.kuan = 0;
        else
            this.kuan = kuan;
    }
}

class Circle extends Shape{
    double r;


    @Override
    public String toString() {
        return "Rectangle area="+getArea()+", peri="+getPeri();
    }

    public Circle(double r) {
        if (r<0)
            this.r = 0;
        else
            this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }

    @Override
    public double getPeri() {
        return 2*r*Math.PI;
    }
}
