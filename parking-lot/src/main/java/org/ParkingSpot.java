package org;

public class ParkingSpot {
    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;
    
    ParkingSpot(int id,
                boolean isEmpty,
                Vehicle vehicle,
                int price){
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
        this.price = price;
    }
    
    public void parkVehicle(Vehicle vehicle){
        vehicle = vehicle;
        isEmpty = false;
    }
    
    public void removeVehicle(){
        vehicle = null;
        isEmpty = true;
    }
    
}
