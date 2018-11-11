/**
   A SafeArray class manipulates array of integer numbers.
   @author Hong Guo
   @version M19COM Code for Worksheet_3
*/
public class SafeArray
{
	private int[] store;
	private int currentSize;

	/**  
		Constructor creates array of given size.
		@param maxSize the array length
	*/
	public  SafeArray(int maxSize)
	{
		store = new int[maxSize];	//create an array of maxSize		
		currentSize = 0;		  		//empty array
	}

	/**
		Add a given value at the current available position in the store.
		@param value the given value
		@return true if successful else false
	*/
	public boolean add(int value)
	{
		//check if the array is full 
		if(currentSize == store.length)
		{
			//we need to expand the array's length to cope
			expand();
		}
		
      //safe to add the element and increase currentSize by one
		store[currentSize++] = value;
		return true;
	}


	/**
		Sort store array into decending order using bobble sort algorithm.
	*/
	public void bobbleSort()
	{
		for(int j = store.length; j > 0; j--)
		{		
	   	for(int i = 0; i < j-1; i++)
			{
		  		if(store[i] < store[i+1])
		  		{
					//calling the helper method
		   			swop(i, i+1);
				}
			}
	 	}
	}
	
	/**
		Swop the two elements - a helper method
		@param i first index
		@param j second index
	*/
	private void swop(int i, int j)
	{
		int temp = store[i];
		store[i] = store[j];
		store[j] = temp;
	}
	
	/**
		Sort the array into decending order using selection sort algorithm.
	*/
	public void selectionSort()
	{
		for(int lastPos = store.length-1; lastPos > 0; lastPos--)
		{
			//calling helper to find & store the return-value in minPos
			int minPos = findMinPosition(lastPos);
			//calling the helper method again 
			swop(minPos, lastPos);
		}
	}
	
	/**
		Find the minimum value index - a helper method.
		@param limit the last index of unsorted part
		@return minimum value index
	*/
	private int findMinPosition(int limit)
	{
		int minPos = 0;
		for (int i = 0; i <= limit; i++)
		{
			if(store[i] < store[minPos])
			{
				minPos = i;
			}
		}
		return minPos;
	}	
	
	/**
		Search for a given value from array.
		@param v value to be searched
		@return index where the value is found else -1
	*/
	public int search(int v)
	{
		int position = -1;
		for(int i = 0; i < store.length; i++)
      {
			if(store[i] == v)
				return position = i;				
		}
		return position;
	}
	

	/**
		Set array to a given array.
		@param a the given array
	*/
	public void setArray(int[] a)
	{
		store = a;
	}
	
	/**
		Expand the array size by one.
	*/
	public void expand()
	{
		//declare a tempArray to hold the current array
		int[] tempArray = store;
		int newSize = store.length+1;
				
		//create a new array that is one element larger
		store = new int[newSize];
		
		//copy the contents of tempArray into the new store (larger array)
		//(note the condition statement 'maxSize-1')
		for(int i = 0; i < tempArray.length; i++)
		{
			store[i] = tempArray[i];
		}
	}
	
	/**
	
	*/
	public String toString()
	{
		String state = "\nElements in the array: \n";
		for(int e : store)
		{
			state = state + e + ", ";
		}
		return state;
	}
	
	public static void main(String[] args)
	{
		//declare a constant (using keyword 'final')
		//that we can use throughout our program
		final int MAX_SIZE = 10;
		
		//instantiate object & pass the size of the array to the constructor
		SafeArray intArray = new SafeArray(MAX_SIZE);

		//populate the array
		boolean okay = true;
		for(int i=0; i<MAX_SIZE; i++)
		{
			//calling add to intArray object of class SafeArray
			//and store the returing-result in okay
			okay = intArray.add((i+2)*3);
			if(!okay)
			{
				System.out.println("Could not add value ...");
			}
		}
		
		System.out.println(intArray.toString());
	}//end main
}

