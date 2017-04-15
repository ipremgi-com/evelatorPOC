package factories;

import model.people.*;

/**
 * Created by IPREMGI on 15/04/2017.
 */
public class PersonFactory {

    public Person getPerson(PersonType pt){

        switch(pt){
            case CLIENT:
                return new Client();
            case EMPLOYEE:
                return new Employee();
            case MAINTENANCE_CREW:
                return new MaintenanceCrew();
            case DEVELOPER_GOGGLES:
                return new Developer(Company.GOGGLES);
            case DEVELOPER_MUGTOME:
                return new Developer(Company.MUGTOME);
            default:
                return null; // need to add exception here
        }
    }

}
