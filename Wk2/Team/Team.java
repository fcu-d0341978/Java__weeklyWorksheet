import java.util.Scanner;

public class Team
{
   private static final int NUM_OF_GAMES = 6;
   private char[] results;
   
   public Team()
   {
      results = new char[NUM_OF_GAMES];
   }
   
   public char[] getResult()
   {
      return results;
   }
   
   public void setResult(char[] results)
   {
      this.results = results;
   }
   
   public int getPoints()
   {
      int total = 0;
      for(int i = 0; i < 6; i++)
      {
         if(results[i] == 'W')
         {
            total += 3;
         }
         else if(results[i] == 'D')
         {
            total += 1;
         }
         else if(results[i] == 'L')
         {
            total += 0;
         }
      }
      return total;
   }
}