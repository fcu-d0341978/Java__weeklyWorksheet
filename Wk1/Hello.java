import java.util.Scanner;

public class Hello
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      Box boxy = new Box(5, 5, 5);
      
      System.out.println("Input a integer");
      int num1 = kb.nextInt();
      System.out.println("Input another integer");
      int num2 = kb.nextInt();
      
      int Volume = boxy.CalcVolume();

      System.out.println("Result of num1 + num2 = " + (num1 + num2)); 
      System.out.println("Volume of boxy = " + Volume);   
   }
}