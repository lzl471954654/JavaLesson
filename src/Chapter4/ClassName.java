package Chapter4;

import java.util.Scanner;

public interface ClassName {
    String getClassName();
}

class Company implements ClassName{
    private String name;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String getClassName() {
        return "name="+name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Company company = new Company(name);
        System.out.println(company.getClassName());
    }
}
