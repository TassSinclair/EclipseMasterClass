package net.sinclairstudios.emc;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Passenger {

  private final String name;
  private final Nationality nationality;
  private final LocalDate dateOfBirth;
  private final Set<Bag> bags = new HashSet<>();

  public Passenger(String name, Nationality nationality, LocalDate dateOfBirth) {
    this.name = name;
    this.nationality = nationality;
    this.dateOfBirth = dateOfBirth;
  }

  public String getName() {
    return name;
  }

  public Nationality getNationality() {
    return nationality;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  // We have a test for this method, in PassengerTest. Use Ctrl-J to "jump" to the test.
  @Override
  public String toString() {
    return String.format("%s (%s)", getName(), getNationality());
  }

  public int getAgeToday() {
    // When implementing getAgeAt, extract the line below into a reusable method.
    // Use Alt-Shift-L to extract LocalDate.now() to a local variable.
    // Use Alt-Shift-M to extract Period.between(...) to a local method.
    // Use Alt-Shift-I to inline the local variable now back to the method call.
    return Period.between(dateOfBirth, LocalDate.now()).getYears();
  }

  public void addBag(Bag bag)
  {
    bags.add(bag);
  }
  
  // Use the "foreach" content assist to implement a foreach loop.
  // Java -> Editor -> Save Actions,
  // Perform on save: "Format Source Code" and "Organise Imports".
  // General -> Workspace -> Save automatically before build.
  public boolean hasBag(Bag bag)
  {
    return false;
  }
}
