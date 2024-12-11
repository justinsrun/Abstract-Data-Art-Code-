import org.code.theater.*;
import org.code.media.*;

/**
 * Represents a Scene to be played in the Theater using data from
 * a choses dataset
 */
public class DataScene extends Scene {

  private Dog[] dogs;      // 1D array of Dog objects

  /** Constructor */
  public DataScene() {
    dogs = createDogs();
  }

  /** Returns a 1D array of Person objects using the txt files in this project */
  public Dog[] createDogs() {
    String[] breedsArray = FileReader.toStringArray("Breed.txt");
    int[] minWeightArray = FileReader.toIntArray("MinWeight.txt");
    int[] maxWeightArray = FileReader.toIntArray("MaxWeight.txt");
    
    Dog[] dogsArray = new Dog[breedsArray.length];
    for (int i = 0; i < dogsArray.length; i++) {
      dogsArray[i] = new Dog(breedsArray[i], minWeightArray[i], maxWeightArray[i]);
    }

    return dogsArray;
  }

  /**
   * Top-level method to draw the animation
   */
  public void drawScene() {


    
    for (Dog dog : dogs) {
      clear("black");

      if(dog.getBreed().equals("Toy")) {
        drawImage("download-(4).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Hound")) {
        drawImage("download-(5).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Terrier")) {
        drawImage("download-(6).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Working")) {
        drawImage("download-(7).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Mixed")) {
        drawImage("download-(8).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Non-Sporting")) {
        drawImage("download-(9).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Sporting")) {
        drawImage("download-(10).jpg", 90, 50, 200);
      } else if (dog.getBreed().equals("Herding")) {
        drawImage("download-(11).jpg", 90, 50, 200);
      }
       
      
      
      

      setTextStyle(Font.MONO, FontStyle.BOLD);
      setTextHeight(25);
      setTextColor("pink");

      drawText(dog.getBreed(), 140, 300);
      
      int minWeight = dog.getMinWeight();
      int maxWeight = dog.getMaxWeight();
      double avgWeight = calcAvgerageWeight(minWeight, maxWeight);
      drawText(avgWeight+" lbs", 140, 350);

      
      pause(0.5);

      
    }
  }

  /** Other Methods */
  public double calcAvgerageWeight(int min, int max) {
    int total = min + max;
    double avg = total / 2;
    return avg;
  }
}