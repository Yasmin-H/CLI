import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Airport airport;

        airport = new Airport("Heathrow");

        System.out.println("Hello, welcome to Heathrow Airport!");
        System.out.println("Would you like to:");






        while(true) {
            System.out.println("1 - Add a new flight");
            System.out.println("2 - Display all available flights");
            System.out.println("3 - Add a new passenger");
            System.out.println("4 - Book a passenger onto a flight");
            System.out.println("5 - Cancel a flight");

            Integer input = scanner.nextInt();

            if (input == 1) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("What is the destination?");
                String destination = scanner2.nextLine();

                System.out.println("What is the flight ID?");
                String id = scanner2.nextLine();

                Flight flight = new Flight(destination, id);
                airport.addFlight(flight);
                System.out.println("Thank you, your flight has been added");
            }
            else if (input == 2) {
                System.out.println(airport.displayFlights());
            }
            else if (input == 3) {
                System.out.println("What is the passengers name?");
                String name = scanner.nextLine();
                System.out.println("What is the passengers ID?");
                String id = scanner.nextLine();
                System.out.println("What is the passengers phone number?");
                String contactInfo = scanner.nextLine();
                Passenger passenger = new Passenger(name, id, contactInfo);
//            }
//            else if (input == 4) {
//                if(airport.getFlightCount()<=0){
//                System.out.println("Sorry there are no available flights, please add a new flight");
//                } else {
//
//                }
            } else if (input == 5){
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Choose the number of the flight you would like to cancel?");
                for(int i = 1; i <= airport.getFlightCount(); i++){
                    System.out.println(i + " - " + airport.flights.get(i - 1).getId() + " to " + airport.flights.get(i - 1).getDestination());
                }
                Integer flight = scanner.nextInt();
                airport.flights.remove(flight - 1);
            }

        }




    }
}
