import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Jamaica", "BA113");
    }

    @Test
    public void canGetDestination(){
        assertThat(flight.getDestination()).isEqualTo("Jamaica");
    }

    @Test
    public void canGetId(){
        assertThat(flight.getId()).isEqualTo("BA113");
    }

    @Test
    public void canAddPassenger(){
        passenger = new Passenger("John Doe", "id1", "07813657389");
        flight.addPassenger(passenger);
        assertThat(flight.getPassengerCount()).isEqualTo(1);
    }






}
