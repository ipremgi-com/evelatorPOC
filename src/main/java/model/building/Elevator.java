package model.building;

import model.people.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IPREMGI on 13/04/2017.
 */

public class Elevator {

    private final int floor;
    private final int maxCapacity;
    private Direction direction;
    private List<Person> persons;


    public Elevator(int floor, int maxCapacity) {
        this.floor = floor;
        this.maxCapacity = maxCapacity;
        this.direction = Direction.UP; // default direction will be UP
        this.persons = new ArrayList<Person>();
    }

    public int getFloor() {
        return floor;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person){
        this.persons.add(person);
    }

    /**
     * Calculate how spaces have been used so far in the elevator
     * @return - used capacity
     */
    private int usedCapacity(){
        int usedCapacity = 0;

        for(Person p: persons){
            usedCapacity += p.getCapacitySize();
        }

        return usedCapacity;
    }

    /**
     * Available capacity left in the elevator
     * maxCapacity - usedCapacity
     * @return
     */
    public int availableCapacity(){
        return maxCapacity - usedCapacity();
    }

    /**
     * If the person can be added to the elevator
     * @param person - the person to add
     * @return - true == YES
     *           false == NO
     */
    public boolean canAddPerson(Person person){
        return (availableCapacity()>= person.getCapacitySize())? true: false;
    }
}
