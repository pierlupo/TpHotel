package org.example;

public class Room {

    private int number;

    private boolean roomstatus;

    private int price;

    private int capacity;

    public Room(int number, boolean roomstatus, int price, int capacity) {
        this.number = number;
        this.roomstatus = roomstatus;
        this.price = price;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatus() {
        return roomstatus;
    }

    public void setStatus(boolean status) {
        this.roomstatus = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", roomstatus=" + roomstatus +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }
}
