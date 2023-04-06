package org.example;

public class Reservation extends Customer {

    private int number;

    private boolean statusResa;

    private int room;

    public Reservation(int id, String firstName, String lastName, long tel, int number, boolean statusResa) {
        super(id, firstName, lastName, tel);
        this.number = number;
        this.statusResa = statusResa;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatusResa() {
        return statusResa;
    }

    public void setStatusResa(boolean statusResa) {
        this.statusResa = statusResa;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "number=" + number +
                ", statusResa=" + statusResa +
                ", room=" + room +
                '}';
    }
}
