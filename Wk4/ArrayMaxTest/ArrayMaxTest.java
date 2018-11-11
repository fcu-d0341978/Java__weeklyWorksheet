public class ArrayMaxTest
{
   
   public int max(int[] a)throws IsNullException

   {
      if(a.length == 0)
      {
         throw new IsNullException("Error");
      }
      
      int temp = 0;
      
      for(int i = 0; i < a.length - 1; i++)
      {
         if(a[i] > a[i + 1]) temp = a[i];
         else if(a[i] < a[i + 1]) temp = a[i + 1];
      }
      
      return temp;
   }
   
   public static void main(String args[])
   {
      ArrayMaxTest test = new ArrayMaxTest();
      
      try
      {
         int[] x = {8, 2, -3, 4, 5, -3, 9};
         System.out.println("The maximum of elements of x is " + test.max(x));
      }
      catch (IsNullException e)
      {    
         System.out.println(e);
      }
      
      try
      {
         int[] b = {};
         System.out.println("The maximum of elements of x is " + test.max(b));
      }
      catch (IsNullException e)
      {    
         System.out.println(e);
      }

   }
}