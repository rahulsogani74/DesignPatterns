package Abstrect;

public class Client {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(employee.name());
        System.out.println(employee.salary());

        Employee employee2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(employee2.name());
        System.out.println(employee2.salary());

        Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
        System.out.println(employee3.name());
        System.out.println(employee3.salary());

    }
}
