package model.building;

import model.people.*;

import java.util.PriorityQueue;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class Floor {

    PriorityQueue<Person> queue;

    public Floor() {
        queue = new PriorityQueue<Person>();
    }
}
