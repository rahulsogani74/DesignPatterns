package Abstrect;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstrectFactory factory){
            return factory.createEmployee();
        }
}
