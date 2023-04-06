package org.example;

import java.util.List;

public class Hostel {

    private String name;

    private List<Customer> listeCustomer;

    private List<Room> listeRoom;

    private List<Reservation> listeReservation;

    public Hostel(String name, List<Customer> listeCustomer, List<Room> listeRoom, List<Reservation> listeReservation) {
        this.name = name;
        this.listeCustomer = listeCustomer;
        this.listeRoom = listeRoom;
        this.listeReservation = listeReservation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", listeCustomer=" + listeCustomer +
                ", listeRoom=" + listeRoom +
                ", listeReservation=" + listeReservation +
                '}';
    }
}
