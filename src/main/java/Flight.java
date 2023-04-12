import java.util.ArrayList;

public class Flight {

    private String destination;
    private String id;

    private ArrayList<Passenger> passengers;

    public Flight(String destination, String id){
        this.destination = destination;
        this.id = id;
        this.passengers = new ArrayList<>();

    }

    public String getDestination() {
        return destination;
    }

    public String getId() {
        return id;
    }


    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }




}
