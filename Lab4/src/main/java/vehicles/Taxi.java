package vehicles;

import people.Person;
import people.Policeman;

import java.util.ArrayList;


public class Taxi<T extends Person> extends Vehicle {
    private String name;
    private ArrayList<T> people;
    private int capacity = 2;

    public Taxi(String name, ArrayList<T> people) {
        this.name = name;
        this.people = people;
    }

    public Taxi() {
    }

    public void getPassengerOut(Object person) {
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
        return "Taxi{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", people=" + people +
                '}';
    }

    public void setPeople(ArrayList people) {
        this.people = people;
    }
}

