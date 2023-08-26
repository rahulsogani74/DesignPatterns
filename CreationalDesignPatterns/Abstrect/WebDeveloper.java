package Abstrect;

public class WebDeveloper implements Employee {
    public int salary(){
        return 60000;
    }
    public String name(){
        System.out.println("Web Developer");
        return "WebDeveloper";
    }
}
