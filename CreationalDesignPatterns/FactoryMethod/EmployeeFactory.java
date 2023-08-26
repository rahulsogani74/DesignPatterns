package FactoryMethod;

public class EmployeeFactory {
    public static Employee getEmployee(String emoType){
        if (emoType.trim().equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if (emoType.trim().equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        else return null;
    }
}
