package net.sinclairstudios.emc;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


// Highlight the class name, anywhere outside of a specific test.
// Then use Alt-Shift X, T to run all tests. 
public class PassengerTest {

  
  // Demonstrate MouseFeed popups by running this test with mouse clicks.
  // Use Ctrl-Shift-↑ and Ctrl-Shift-↓ to navigate between methods.
  @Test
  public void shouldGenerateToStringWithNameAndNationality() {
    Passenger passenger = new Passenger("Joe Shmoe", Nationality.NZ, null);

    assertThat(passenger.toString()).isEqualTo("Joe Shmoe (NZ)");
  }
  
  // Highlight this method name, then use Alt-Shift X, T to run this test.
  // Modify the test to include the wrong expectation. InfiniTest will fail.
  @Test
  public void shouldShowCorrectAgeForToday() {
    Passenger passenger = new Passenger("Joe Shmoe", Nationality.NZ,
        LocalDate.now().minus(5, ChronoUnit.YEARS));
    
    assertThat(passenger.getAgeToday()).isEqualTo(5);
  }
  
  // Use Mockito mock(...) and when(...) to complete this test.
  // Java -> Editor -> Content Assist -> Favorites
  // Add org.mockito.Mockito
  @Test
  public void shouldReturnTrueWhenAskingIfPassengerHasABagThatTheyShouldHave() {
    Passenger passenger = new Passenger("Joe Shmoe", Nationality.NZ, null);
    passenger.addBag(new Bag("TAG#001", 12));
    
    Bag bag = null; // mock(...)?
    
    // when(...)?
    
    
    assertThat(passenger.hasBag(bag)).isTrue();   
  }
  
  // Finish this test. Use Ctrl-/ to uncomment the failing line and
  // Ctrl-1 to show "quick fix" suggestions. 
  @Test
  public void shouldShowCorrectAgeForLocalDate() {
    Passenger passenger = new Passenger("Joe Shmoe", Nationality.NZ,
        LocalDate.of(2000, Month.JANUARY, 1));

    LocalDate fiveYearsLater = LocalDate.of(2005, Month.JANUARY, 1);
    LocalDate tenYearsLater = LocalDate.of(2010, Month.JANUARY, 1);

    // Use Ctrl-Alt-↑ and Ctrl-Alt-↓ to duplicate a selection of code above or below.
//     assertThat(passenger.getAgeAt(fiveYearsLater)).isEqualTo(5);

  }

  @Test
  public void testGetAgeToday()
    throws Exception
  {
    throw new RuntimeException("not yet implemented");
  }
}