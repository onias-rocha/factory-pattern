package com.mercadolivre.factory;

import com.mercadolivre.vehicles.Vehicle;
import com.mercadolivre.vehicles.impl.Bike;
import com.mercadolivre.vehicles.impl.Boat;
import com.mercadolivre.vehicles.impl.Car;
import com.mercadolivre.vehicles.impl.Rocket;

public class VehicleFactory {

    public static Vehicle getVehicle(String description){
        return switch(description) {
            case "space" ->  new Rocket();
            case "water" -> new Boat();
            case "speed" -> new Bike();
            default -> new Car();
        };
    }
}
