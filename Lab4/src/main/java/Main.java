import people.Person;
import people.Policeman;
import road.Road;
import vehicles.Bus;
import vehicles.PoliceCar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Policeman dev =  new Policeman("Dev");
        Policeman no = new Policeman("No");
        people.add(dev);
        people.add(new Policeman("Den"));
        people.add(new Policeman("Max"));



        Bus bus = new Bus();
        bus.setPeople(people);
        bus.getPassengerOut(dev);
        bus.getPassengerOut(dev);
        ArrayList<Policeman> newList = new ArrayList<>();
        newList.add(dev);
        newList.add(no);
        PoliceCar policeCar = new PoliceCar("Police",newList);
        policeCar.addPassenger(dev);
        policeCar.addPassenger(no);
        policeCar.setName("PoliceCar");
        System.out.println("policeCar.getCapacity() = " + policeCar.getCapacity());
        System.out.println("policeCar.getNumberOfEmptySeats() = " + policeCar.getNumberOfEmptySeats());
        Road road = new Road();
        road.addCarToRoad(policeCar);
        road.addCarToRoad(bus);
        System.out.println("road.getCountOfHumans() = " + road.getCountOfHumans());
    }
}
