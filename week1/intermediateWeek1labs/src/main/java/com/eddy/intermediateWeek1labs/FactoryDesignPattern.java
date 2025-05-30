package com.eddy.intermediateWeek1labs;

public class FactoryDesignPattern {

    public interface Vehicle {
        void vehiclePurpose();
    }

    public static class Bike implements Vehicle {
        @Override
        public void vehiclePurpose() {
            System.out.println("This is a Bike for personal use.");
        }
    }

    public static class Car implements Vehicle {
        @Override
        public void vehiclePurpose() {
            System.out.println("This is a Car for family use.");
        }
    }

    public static class Truck implements Vehicle {
        @Override
        public void vehiclePurpose() {
            System.out.println("This is a Truck for cargo transport.");
        }
    }

    public static class VehicleFactory {
        public Vehicle getVehicle(String purpose) {
            if (purpose.equalsIgnoreCase("personal")) {
                return new Bike();
            } else if (purpose.equalsIgnoreCase("family")) {
                return new Car();
            } else if (purpose.equalsIgnoreCase("cargo")) {
                return new Truck();
            } else {
                throw new IllegalArgumentException("Unknown purpose: " + purpose);
            }
        }
    }

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle vehicle1 = factory.getVehicle("personal");
        vehicle1.vehiclePurpose();

        Vehicle vehicle2 = factory.getVehicle("family");
        vehicle2.vehiclePurpose();

        Vehicle vehicle3 = factory.getVehicle("cargo");
        vehicle3.vehiclePurpose();
    }
}

