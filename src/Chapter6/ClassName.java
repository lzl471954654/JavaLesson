package Chapter6;

import java.util.Scanner;

public interface ClassName {
    void getClassName();
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Company company = new Company(name);
        company.getClassName();
    }
}

class Company implements ClassName{
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public void getClassName() {
        System.out.println("name="+name);
    }
}
