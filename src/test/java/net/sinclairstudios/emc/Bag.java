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
}
