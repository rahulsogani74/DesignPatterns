package FactoryMethod;

public class WebDeveloper implements Employee {
    public int salary(){
        System.out.println("Web Developer Salary");
        return 60000;
    }
}
