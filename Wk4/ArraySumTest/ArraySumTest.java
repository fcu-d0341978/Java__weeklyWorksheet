// Exercise_1 for m19com Lab4
// Write the implementation according to contract
public class ArraySumTest 
{

	public int sum(int[] a) throws IsNullException
	{
    	// Precondition: a is not null
    	// Postcondition: Returns the sum of the elements of a

      if(a == null)
      {
         throw new IsNullException("Input is null");
      }
        
      int sum = 0;
      
      for(int i = 0; i < a.length; i++)
      {
         sum = sum + a[i];
      }
		return sum; // Replace by proper implementation!
   }

	public static void main(String args[]) 
	{     
		ArraySumTest arrayTester = new ArraySumTest();
		
		// A first example call
      try
      {
         int[] x = {8, 2, -3, 4, 5, -3, 9};
         System.out.println("The sum of elements of x is " + arrayTester.sum(x));
      }
      catch (IsNullException e)
      {    
         System.out.println(e);
      }

      // Your implementation has to deal with empty arrays, so this
      // should work fine
      try
      {
         int[] y = null;
         System.out.println("The sum of elements of y is " + arrayTester.sum(y));
      }
      catch (IsNullException e)
      {    
         System.out.println(e);
      }
	}
}
