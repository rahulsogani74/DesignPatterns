package Abstrect;

public class WebDeveloperFactory extends EmployeeAbstrectFactory {
    @Override
    public Employee createEmployee(){
        return new WebDeveloper();
    }

}
