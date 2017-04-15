package model.people;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class Client extends Person {

    public Client(){
        setRange(0);
        setCapacitySize(1);
    }


    public String getType() {
        return "Client";
    }
}
