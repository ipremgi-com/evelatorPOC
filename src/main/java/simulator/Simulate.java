package simulator;

import factories.PersonFactory;
import model.people.Person;
import model.people.PersonType;

/**
 * Created by IPREMGI on 15/04/2017.
 */
public class Simulate {


    public static void main(String[] args) {

        Person p;
        PersonFactory pf = new PersonFactory();

        for(int i = 0; i<10; i++){
            p = pf.getPerson(PersonType.randomPerson());
            System.out.println(p.getType());
            System.out.println();
        }
    }
}
