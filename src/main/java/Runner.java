import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Airport airport;

        airport = new Airport("Heathrow");

        System.out.println("Hello, welcome to Heathrow Airport!");
        System.out.println("Would you like to:");

        ArrayList<Passenger> passengersAvailable = new ArrayList<>();



        while(true) {
            System.out.println("");
            System.out.println("1 - Add a new flight");
            System.out.println("2 - Display all available flights");
            System.out.println("3 - Add a new passenger");
            System.out.println("4 - Book a passenger onto a flight");
            System.out.println("5 - Cancel a flight");

            String input = scanner.nextLine();


            try {
                if (Integer.parseInt(input) == 1) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("What is the destination?");
                    String destination = scanner2.nextLine();

                    System.out.println("What is the flight ID?");
                    String id = scanner2.nextLine();

                    Flight flight = new Flight(destination, id);
                    airport.addFlight(flight);
                    System.out.println("Thank you, your flight has been added");
                }
                else if (Integer.parseInt(input) == 2) {
                    System.out.println(airport.displayFlights());
                }
                else if (Integer.parseInt(input) == 3) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("What is the passengers name?");
                    String name = scanner2.nextLine();
                    System.out.println("What is the passengers ID?");
                    String id = scanner2.nextLine();
                    System.out.println("What is the passengers phone number?");
                    String contactInfo = scanner2.nextLine();
                    Passenger passenger = new Passenger(name, id, contactInfo);
                    passengersAvailable.add(passenger);
                }
                else if (Integer.parseInt(input) == 4) {
                    if (airport.getFlightCount() <= 0) {
                        System.out.println("Sorry there are no available flights, please add a new flight");
                    } else {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.println("What passenger would you like to book onto a flight?");
                        for (int i = 1; i <= passengersAvailable.size(); i++) {
                            System.out.println(i + " - " + passengersAvailable.get(i - 1).getName() + " " + passengersAvailable.get(i - 1).getId());
                        }
                        Integer passenger = scanner2.nextInt();
                        System.out.println("what flight would you like to book the passenger to?");
                        for (int i = 1; i <= airport.getFlightCount(); i++) {
                            System.out.println(i + " - " + airport.flights.get(i - 1).getId() + " to " + airport.flights.get(i - 1).getDestination());
                        }
                        Integer flight = scanner2.nextInt();
                        airport.bookPassenger(airport.flights.get(flight - 1), passengersAvailable.get(passenger - 1));
                        System.out.println("You have successfully booked passenger " + passengersAvailable.get(passenger - 1).getName() + " onto flight " + airport.flights.get(flight - 1).getId() + " to " + airport.flights.get(flight - 1).getDestination() + ".");
                    }
                }
                else if (Integer.parseInt(input) == 5) {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Choose the number of the flight you would like to cancel?");
                    for (int i = 1; i <= airport.getFlightCount(); i++) {
                        System.out.println(i + " - " + airport.flights.get(i - 1).getId() + " to " + airport.flights.get(i - 1).getDestination());
                    }
                    Integer flight = scanner.nextInt();
                    airport.flights.remove(flight - 1);
                } else {
                    System.out.println("Wrong input! Please input the number of the action you would like to take.");
                }

            } catch (NumberFormatException e){
                System.out.println("Sorry, please input an integer");
            }

        }






    }


}
