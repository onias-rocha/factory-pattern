package com.mercadolivre;

import com.mercadolivre.factory.VehicleFactory;
import com.mercadolivre.vehicles.Vehicle;
import com.mercadolivre.vehicles.impl.Car;

public class Main {

    public static void main(String[] args) {

//        Car carro = new Car();
//        carro.usage();

        var vehicle = VehicleFactory.getVehicle("speed");
        vehicle.usage();

    }
}
