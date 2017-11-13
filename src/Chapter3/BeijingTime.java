package Chapter3;

import java.util.Scanner;

public class BeijingTime {
    short hour;
    short minute;
    short second;

    public BeijingTime(short hour, short minute, short second) {
        if(hour>=0&&hour<=23)
            this.hour = hour;
        else
            this.hour = 0;
        if(minute>=0&&minute<=59)
            this.minute = minute;
        else
            this.minute = 0;
        if(second>=0&&second<=59)
            this.second = second;
        else
            this.second = 0;
    }

    public void showTime(){
        String hour;
        String min;
        String second;
        if(this.hour<10&&this.hour!=0){
            hour = "0"+this.hour;
        }else
            hour = Integer.toString(this.hour);
        if(this.minute<10&&this.minute!=0)
            min = "0"+this.minute;
        else
            min = Integer.toString(this.minute);
        if(this.second<10&&this.second!=0)
            second = "0"+this.second;
        else
            second = Integer.toString(this.second);
        System.out.println("now BeijingTime is "+hour+":"+min+":"+second);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short hour = scanner.nextShort();
        short min = scanner.nextShort();
        short second = scanner.nextShort();
        BeijingTime time = new BeijingTime(hour,min,second);
        time.showTime();
    }
}
