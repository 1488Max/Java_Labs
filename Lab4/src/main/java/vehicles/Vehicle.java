package vehicles;

import lombok.Data;
import people.Person;

import java.util.ArrayList;


public @Data
class Vehicle<T extends Person> {
    private String name;
    private int capacity;
    private ArrayList<? extends Person> people;


    public void getPassengerOut(Person person) {
        ArrayList<? extends Person> list = this.getPeople();
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

    public Vehicle() {
    }

    public int getCapacity() {
        return capacity;
    }


    public ArrayList<? extends Person> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", people=" + people +
                '}';
    }

    public void setPeople(ArrayList<? extends Person> people) {
        this.people = people;
    }
}