import java.util.Scanner;

public class Averager{
   public static void main (String [] args){
   Scanner scnr = new Scanner(System.in);
   double averageScores = 0;
   int numScores = 0;
   
   System.out.print("Enter your first test score, or -1 to quit.");
   double addScores = scnr.nextInt();
   while (addScores != -5) {
      numScores = numScores + 1;
      averageScores = averageScores + addScores/numScores;
      System.out.println("Please enter the next test score or -5 to quit.");
      addScores = scnr.nextDouble();
   }
   
   System.out.println("The averagae of your scores is " +averageScores);
   }
 }