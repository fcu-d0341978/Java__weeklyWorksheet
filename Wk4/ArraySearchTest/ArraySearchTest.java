public class ArraySearchTest
{
   
   public int search(int[] a, int index)
   {
      int i, value = -1;
      boolean missing = false;
      for(i = 0; i < a.length; i++)
      {
         if(index == a[i])
         {
            value = i + 1;
         } 
      }
      return value;
   }
   
   public static void main(String args[])
   {
      ArraySearchTest test = new ArraySearchTest();
      
      int[] x = {1, 3, 6, 4, 5, 45, 99, 8};
      System.out.println("The element 99 appeared in " + test.search(x,99) + " position");
      System.out.println("The element 100 appeared in " + test.search(x,100) + " position");
      System.out.println("The element 6 appeared in " + test.search(x,6) + " position");
   }
}
