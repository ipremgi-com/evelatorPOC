package model.people;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public abstract class Person {

    private int range;
    private int capacitySize;

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getCapacitySize() {
        return capacitySize;
    }

    public void setCapacitySize(int capacitySize) {
        this.capacitySize = capacitySize;
    }

    abstract public String getType();
}
