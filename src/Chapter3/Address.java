package Chapter3;

import java.util.Scanner;

public class Address {
    private String name;
    private String eMail;
    private String phoneNumber;

    public Address(String name, String eMail, String phoneNumber) {
        this.name = name;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public void show(){
        System.out.println("name="+name+",telephone="+phoneNumber+",eMail="+eMail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String phone = scanner.next();
        String eMail = scanner.next();
        Address address = new Address(name,eMail,phone);
        address.show();
    }
}
