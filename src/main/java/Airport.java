import java.util.ArrayList;

public class Airport {

    private String name;
    public ArrayList<Flight> flights;


    public Airport(String name){
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public int getFlightCount(){
        return this.flights.size();
    }

    public String displayFlights() {
        String flightsDisplay = "";
        for (Flight flight : this.flights) {
            flightsDisplay += flight.getId() + " to " + flight.getDestination() + ", ";
        }

        return flightsDisplay;
    }


    public void cancelFlight(Flight flight){
        this.flights.remove(flight);
    }

    public void bookPassenger(Flight flight, Passenger passenger){
        flight.addPassenger(passenger);
    }








}
