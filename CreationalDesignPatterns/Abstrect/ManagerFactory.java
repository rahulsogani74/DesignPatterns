package Abstrect;

public class ManagerFactory extends EmployeeAbstrectFactory {
    @Override
    public Employee createEmployee(){
        return new Manager();
    }

}
