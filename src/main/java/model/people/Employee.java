package model.people;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class Employee extends Person{

    public Employee() {
        setRange(0);
        setCapacitySize(1);
    }

    public String getType() {
        return "Employee";
    }
}
