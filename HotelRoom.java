/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prefinalactivity;

/**
 *
 * @author Complab 3
 */
public class HotelRoom {

    // Parent class
    public static class Room {

        // Properties
        protected int roomNumber;
        protected String roomType;
        protected String guestName;
        protected int numberOfNights;

        // Constructor
        public Room(int roomNumber, String roomType, String guestName,
                    int numberOfNights) {
            this.roomNumber = roomNumber;
            this.roomType = roomType;
            this.guestName = guestName;
            this.numberOfNights = numberOfNights;
        }

        // Method to be overridden
        public double calculateBookingCost() {
            return 0.00;
        }

        // Display booking information
        public void displayBooking() {
            System.out.println("===== HOTEL BOOKING =====");
            System.out.println();
            System.out.println("Room Type: " + roomType);
            System.out.println();
            System.out.println("Room Number: " + roomNumber);
            System.out.println();
            System.out.println("Guest: " + guestName);
            System.out.println();
            System.out.println("Nights: " + numberOfNights);
            System.out.println();
            System.out.printf("Booking Cost: ₱%.2f%n", calculateBookingCost());
            System.out.println();
            System.out.println();
        }
    }


    // Standard Room
    public static class StandardRoom extends Room {

        public StandardRoom(int roomNumber, String guestName,
                            int numberOfNights) {

            super(roomNumber, "Standard", guestName, numberOfNights);
        }

        @Override
        public double calculateBookingCost() {

            double dailyRate = 1500.00;

            return dailyRate * numberOfNights;
        }
    }


    // Deluxe Room
    public static class DeluxeRoom extends Room {

        public DeluxeRoom(int roomNumber, String guestName,
                          int numberOfNights) {

            super(roomNumber, "Deluxe", guestName, numberOfNights);
        }

        @Override
        public double calculateBookingCost() {

            double dailyRate = 2500.00;
            double breakfastFee = 300.00;

            return (dailyRate + breakfastFee) * numberOfNights;
        }
    }


    // Suite Room
    public static class SuiteRoom extends Room {

        public SuiteRoom(int roomNumber, String guestName,
                         int numberOfNights) {

            super(roomNumber, "Suite", guestName, numberOfNights);
        }

        @Override
        public double calculateBookingCost() {

            double dailyRate = 4000.00;
            double serviceFee = 1000.00;

            return (dailyRate * numberOfNights) + serviceFee;
        }
    }


    // Main method
    public static void main(String[] args) {

        // Room array demonstrating polymorphism
        Room[] rooms = {
            new StandardRoom(101, "Pedro Cruz", 3),
            new DeluxeRoom(202, "Ana Reyes", 2),
            new SuiteRoom(301, "Carlo Santos", 2)
        };

        // Display all bookings
        for (Room room : rooms) {
            room.displayBooking();
        }
    }
}
