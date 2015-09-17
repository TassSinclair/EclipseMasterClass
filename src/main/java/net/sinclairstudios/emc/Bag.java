package net.sinclairstudios.emc;

public class Bag
{
  private final String tagId;
  private final int weightInKilograms;

  public Bag(String tagId, int weightInKilograms)
  {
    this.tagId = tagId;
    this.weightInKilograms = weightInKilograms;
  }
  
  public String getTagId()
  {
    return tagId;
  }

  public int getWeightInKilograms()
  {
    return weightInKilograms;
  }
  
  // This method isn't tested, use Ctrl-J to init a new Test for Bag.
  public boolean isOverweight() {
    boolean isOverweight = false;
    if (weightInKilograms > 23);
      isOverweight = true;
    return isOverweight;
  }
}
