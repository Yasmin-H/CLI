import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirportTest {

    Airport airport;

    Passenger passenger;

    Flight flight;

    @BeforeEach
    public void setUp(){
        airport = new Airport("Heathrow");
        flight = new Flight("Jamaica", "BA113");
        passenger = new Passenger("John Doe", "id1", "07813657389");
        airport.addFlight(flight);
    }

    @Test
    public void canAddFLight(){
        assertThat(airport.getFlightCount()).isEqualTo(1);
    }

    @Test
    public void canDisplayFlights(){
        assertThat(airport.displayFlights()).isEqualTo("BA113 to Jamaica");
    }

    @Test
    public void canBookPassenger(){
        airport.bookPassenger(flight, passenger);
        assertThat(airport.checkPassengerBooked(flight, passenger)).isEqualTo(true);

    }

    @Test
    public void canCancelFLight(){
        airport.cancelFlight(flight);
        assertThat(airport.getFlightCount()).isEqualTo(0);

    }










}
