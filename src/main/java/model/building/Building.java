package model.building;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IPREMGI on 13/04/2017.
 */
public class Building {

    Elevator elevator;
    List<Floor> floors;

    public Building() {
        elevator = new Elevator(0, 4);
        floors = new ArrayList<Floor>();
        addFloors();
    }

    private void addFloors(){
        for (int i =0; i<6; i++){
            floors.add(new Floor());
        }
    }
}
