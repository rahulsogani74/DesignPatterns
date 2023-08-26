package FactoryMethod;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(employee);
        System.out.println(employee.salary());

        Employee employee2 = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(employee2);
        System.out.println(employee2.salary());

    }
}
