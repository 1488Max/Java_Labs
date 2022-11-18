package vehicles;

import people.FireFighter;
import people.Person;

import java.util.ArrayList;


public class Bus<T extends FireFighter> extends Vehicle {
    private String name;
    private ArrayList<T> people;
    private int capacity = 20;

    public Bus(String name, ArrayList<T> people) {
        this.name = name;
        this.people = people;
    }

    public Bus() {
    }

    public void addPassenger(T person) {
        if(getNumberOfEmptySeats()>0) {
            ArrayList<T> list = (ArrayList<T>) this.getPeople();

            if (list.contains(person)) {
                System.out.println("This passenger is already here");
            } else {
                list.add(person);
                System.out.println("Person added");
            }
        }
        else System.out.println("There is no empty seats");
    }

    public void getPassengerOut(T person) {
        ArrayList<T> list = this.getPeople();
        if (list.contains(person)) {
            list.remove(person);
            setPeople(list);
            System.out.println("Passenger got out");
        } else {
            System.out.println("There is no such passenger");
        }
    }


    public int getNumberOfEmptySeats() {
        return getCapacity() - getPeople().size();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getCapacity() {
        return capacity;
    }


    public ArrayList<T> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "FireTruck{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", people=" + people +
                '}';
    }

    public void setPeople(ArrayList people) {
        this.people = people;
    }
}

