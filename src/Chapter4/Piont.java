package Chapter4;

import java.util.Scanner;

public class Piont {
    int x;
    int y;

    public Piont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Piont o){
        return Math.sqrt((double)(Math.pow(o.x-x,2)+Math.pow(o.y-y,2)));
    }

    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Piont p1 = new Piont(x,y);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Piont p2 = new Piont(x,y);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        Piont3D d = new Piont3D(x,y,z);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        Piont3D d1 = new Piont3D(x,y,z);
        System.out.println("plane d="+p1.distance(p2));
        System.out.println("space d="+d.distance(d1));
    }
}

class Piont3D extends Piont{
    int z;

    public Piont3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public double distance(Piont3D o) {
        if(o.isOriginal()||isOriginal()){
            return Math.sqrt(Math.pow(o.x-x,2)+Math.pow(o.y-y,2)+Math.pow(o.z-z,2));
        }
        else
            return Math.sqrt(Math.pow(super.distance(o),2)+Math.pow(o.z-z,2));
    }

    private boolean isOriginal(){
        return x==0&&y==0&&z==0;
    }
}
