package net.sinclairstudios.emc;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PassengerTest {

  @Test
  public void shouldGenerateToStringWithNameAndAge() {
    Passenger passenger = new Passenger("Joe Shmoe", Nationality.NZ, 44);

    Assertions.assertThat(passenger.toString()).isEqualTo("Joe Shmoe (44)");
  }
}