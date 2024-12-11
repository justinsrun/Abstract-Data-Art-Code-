/**
 * Represents a Dog
 */
public class Dog {

  private String breed;     //name of dog breed
  private int minWeight;         //min weight of dog
  private int maxWeight;         //max weight of dog

  /** Constructor */
  public Dog(String breed, int minWeight, int maxWeight) {
    this.breed = breed;
    this.minWeight = minWeight;
    this.maxWeight = maxWeight;
  }

  /** Accessor Method for breed */
  public String getBreed() {
    return breed;
  }
  
  /** Accessor Method for minWeight */
  public int getMinWeight() {
    return minWeight;
  }

  /** Accessor Method for maxWeight */
  public int getMaxWeight() {
    return maxWeight;
  }
  
}