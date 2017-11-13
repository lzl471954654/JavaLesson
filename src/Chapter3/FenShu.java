package Chapter3;

import java.util.Scanner;

public class FenShu {
    private int zi;
    private int mu;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FenShu fenShu1 = new FenShu(scanner.nextInt(),scanner.nextInt());
        FenShu fenShu2 = new FenShu(scanner.nextInt(),scanner.nextInt());
        fenShu1.cheng(fenShu2);
    }

    public FenShu(int zi, int mu) {
        this.zi = zi;
        this.mu = mu;
    }

    public void cheng(FenShu o){
        int fenzi = zi*o.getZi();
        int fenmu = mu*o.getMu();
        int gcd = getGcd(fenzi,fenmu);
        fenzi/=gcd;
        fenmu/=gcd;
        System.out.println(fenzi+"/"+fenmu);
    }

    private int getGcd(int a,int b){
        if(b==0)
            return a;
        return getGcd(b,a%b);
    }

    public int getZi() {
        return zi;
    }

    public void setZi(int zi) {
        this.zi = zi;
    }

    public int getMu() {
        return mu;
    }

    public void setMu(int mu) {
        this.mu = mu;
    }
}
