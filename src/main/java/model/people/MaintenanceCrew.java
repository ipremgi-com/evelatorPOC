package model.people;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class MaintenanceCrew extends Person {

    public MaintenanceCrew() {
        setRange(0);
        setCapacitySize(4);
    }

    public String getType() {
        return "Maintenance Crew";
    }
}
