import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("John Doe", "id1", "07813657389");

    }

    @Test
    public void canGetName(){
        assertThat(passenger.getName()).isEqualTo("John Doe");
    }

    @Test
    public void canGetId(){
        assertThat(passenger.getId()).isEqualTo("id1");
    }









}
