import java.util.Scanner;

public class Test
{
   public static void main(String args[])
   {
      Scanner kb = new Scanner(System.in);
      Team Yankees = new Team();
      char[] result = {'W', 'L', 'W', 'W', 'D', 'D'};
      
      Yankees.setResult(result);
      
      System.out.println("The results of the 6 games is:" + new String(Yankees.getResult()));
      System.out.println("The total points is:" + Yankees.getPoints());
   }
}