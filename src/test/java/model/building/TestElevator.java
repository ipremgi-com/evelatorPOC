package model.building;

import junit.framework.Assert;
import model.people.*;

import org.junit.Test;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class TestElevator {


    @Test
    public void testAvailableCapacity(){
        Elevator elevator = new Elevator(0,4);

        elevator.addPerson(new Employee());
        elevator.addPerson(new Developer(Company.GOGGLES));

        Assert.assertEquals(2, elevator.availableCapacity());

    }

    /**
     * Should return false
     */
    @Test
    public void testCanAddPerson_1(){
        Elevator elevator = new Elevator(0,4);

        elevator.addPerson(new Employee());
        elevator.addPerson(new Developer(Company.GOGGLES));

        Assert.assertEquals(false, elevator.canAddPerson(new MaintenanceCrew()));

    }

    /**
     * Should return true
     */
    @Test
    public void testCanAddPerson_2(){
        Elevator elevator = new Elevator(0,4);

        elevator.addPerson(new Employee());
        elevator.addPerson(new Developer(Company.MUGTOME));

        Assert.assertEquals(true, elevator.canAddPerson(new Client()));

    }

    @Test
    public void testCanAddPerson_3(){
        Elevator elevator = new Elevator(0,4);

        elevator.addPerson(new MaintenanceCrew());

        Assert.assertEquals(false, elevator.canAddPerson(new Client()));

    }









}
