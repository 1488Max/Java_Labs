package road;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Road {
    public List<Vehicle> carsInRoad = new ArrayList<>();
    public int getCountOfHumans(){
        int result = 0;
        for (int i = 0; i < carsInRoad.size(); i++) {
            result += carsInRoad.get(i).getPeople().size();
        }
        return result;
    }
    public void addCarToRoad(Vehicle vehicle){
        carsInRoad.add(vehicle);
    }
}
