//Alexander Bockheim 
//CS 145
// This is my lab 5 the towers of hanoi using recursion
 
import java.util.Scanner;

public class TowersofHanoi {

   private static final String SOURCE_PEG = "Source";

   private static final String TARGET_PEG = "Target";
   
   private static final String SPARE_PEG = "Spare";
   
   private static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Please enter number of discs that you want:");
      
      int numberOfDiscs = scanner.nextInt();
      
      solveTowersOfHanoi(numberOfDiscs, SOURCE_PEG, TARGET_PEG, SPARE_PEG);
   
   scanner.close();
 
 }


   private static void solveTowersOfHanoi(int numberOfDiscs, String sourcePeg, //solving the towers 
      
      String targetPeg, String sparePeg) {
   
   if (numberOfDiscs == 1) {
      
      System.out.println(sourcePeg + " => " + targetPeg);
 
   } else {
   
      solveTowersOfHanoi(numberOfDiscs - 1, sourcePeg, sparePeg,targetPeg);
      
      System.out.println(sourcePeg + " => " + targetPeg);
      
      solveTowersOfHanoi(numberOfDiscs - 1, sparePeg, targetPeg, sourcePeg);
   
   }
 
 }

}

