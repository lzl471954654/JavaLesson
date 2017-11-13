package Chapter1;

public class Main {
    public static Integer i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread s1 = new Thread(counter);
        Thread s2 = new Thread(counter);
        s1.start();
        s2.start();
        s1.join();
        s2.join();
        System.out.println(i);
    }

    public static Runnable counter = ()->{
        for (int j = 0;j<10000000;j++){
            synchronized (i){
                i++;
            }
        }
    };
}
