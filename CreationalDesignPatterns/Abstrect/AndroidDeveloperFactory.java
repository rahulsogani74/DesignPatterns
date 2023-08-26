package Abstrect;

public class AndroidDeveloperFactory extends EmployeeAbstrectFactory {
    @Override
    public Employee createEmployee(){
        return new AndroidDeveloper();
    }

}
